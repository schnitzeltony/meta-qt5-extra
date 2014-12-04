# This class helps to align paths for cmake files in build sysroot while 
# keeping proper paths on target packages
#
# Alignment is controlled by
#
# CMAKE_HIDE_ERROR[unique-id] = "dir, search, replace"
#
# -f<file-in-WORKDIR>
# -s<string>
# -c<shell-command>

CMAKEINSTALLED = "${WORKDIR}/staged_cmake_files"

# 1. basic checks for CMAKE_HIDE_ERROR
python () {
    cmakehideflags = d.getVarFlags("CMAKE_HIDE_ERROR") or {}
    pn = d.getVar('PN', True)
    if cmakehideflags:
        for flag, flagval in sorted(cmakehideflags.items()):
            items = flagval.split(",")
            num = len(items)
            if num != 3:
                bb.fatal('CMAKE_HIDE_ERROR[%s] requires 3 parameters (dir, search, replace) in %s' % (flag, pn))
    else:
        bb.fatal('The recipe %s inherits cmake-lib but does not set CMAKE_HIDE_ERROR' % pn)
}

# 2. remove tmp file from last build
python do_populate_sysroot_prepend() {
    tmpfile = d.getVar('CMAKEINSTALLED', True)
    if os.path.isfile(tmpfile):
        os.remove(tmpfile)
}

# 3. keep cmake files staged to sysroot
sysroot_stage_dir_append() {
    # avoid doubles causing double replacement
    for file in `find $dest -name '*.cmake'`; do
        if ! grep -q "$file" ${CMAKEINSTALLED} ; then
            echo "$file" >> ${CMAKEINSTALLED}
        fi
    done
}

# 4. Handle CMAKE_HIDE_ERROR
python do_populate_sysroot_append() {
    pn = d.getVar('PN', True)

    # parse single parameter in CMAKE_HIDE_ERROR[..] and return array of line strings extracted
    def parseparam(param, flag):
        param = param.strip()
        if len(param) > 2:
            cmd = param[0:2]
            cmdparam = param[2:]

            # handle file in WORKDIR
            if cmd == '-f' or cmd == '-F':
                filename = "%s/%s" % (d.getVar('WORKDIR', True), cmdparam)
                if os.path.isfile(filename):
                    fd = open(filename, 'r')
                    str = fd.read()
                    fd.close()
                    if cmd == '-f':
                        return str
                    else:
                        return d.expand(str)
                else:
                    bb.fatal("file '%s' referenced in %s could not be found" % (filename, pn))

            # handle string
            elif cmd == '-s':
                return cmdparam
            elif cmd == '-S':
                return d.expand(cmdparam)

            # handle shell command
            elif cmd == '-c' or cmd == '-C':
                # pre expand for shell
                if cmd == '-C':
                    cmdparam = d.expand(cmdparam)
                pipe = os.popen(cmdparam)
                str = pipe.read()
                pipe.close()
                return str
            else:
                bb.fatal("CMAKE_HIDE_ERROR[%s] contains an invalid parameter '%s%s' in %s" % (flag, cmd, cmdparam, pn))
        else:
            bb.fatal("Parameter %s is too short for CMAKE_HIDE_ERROR[%s] in %s" % (param, flag, pn))

    # first check if cmake files were installed to sysroot
    tmpfile = d.getVar('CMAKEINSTALLED', True)
    if (not os.path.isfile(tmpfile)) or os.path.getsize(tmpfile) == 0:
        bb.warn("There were no cmake files installed by %s" % pn)
    else:
        # parse CMAKE_HIDE_ERROR[..]
        cmakehideflags = d.getVarFlags("CMAKE_HIDE_ERROR") or {}
        sysroot = d.getVar('SYSROOT_DESTDIR', True)

        for flag, flagval in sorted(cmakehideflags.items()):
            items = flagval.split(",")

            # 1. cmake-subdirectory in sysroot
            cmakedir = d.expand(items[0])
            if len(cmakedir) == 0:
                bb.fatal('Directory in CMAKE_HIDE_ERROR[%s] must not be empty in %s' % (flag, pn))
            # check if this directory is created by us
            pipe = os.popen('grep %s %s' % (cmakedir, d.getVar('CMAKEINSTALLED', True)))
            matching_files = pipe.readlines()
            pipe.close()
            if len(matching_files) == 0:
                bb.warn("No matching cmake file found for directory '%s' set by CMAKE_HIDE_ERROR[%s] in %s" % (cmakedir, flag, pn))

            # 2. search
            search = parseparam(items[1], flag)
            if len(search) == 0:
                bb.warn("Search string must not be empty - see CMAKE_HIDE_ERROR[%s] in %s" % (flag, pn))

            # 3. replace
            replace = parseparam(items[2], flag)

            # TBD: further checks?
            #bb.warn("cmakedir: '%s' search: '%s' replace: '%s'" % (cmakedir, search, replace))

            # Now do the replacements
            if len(matching_files) > 0:
                replacement_performed = False
                # HACK/REVISIT: do_siteconfig causes double replacement.
                # Add a marker to detect that we already replaced
                replace_key = "#CMAKE_HIDE_ERROR[%s]-%s replaced" % (flag, pn)
                for filename in matching_files:
                    filename = filename.replace('\n','')
                    f = open(filename, 'r')
                    cmakestr = f.read()
                    f.close()
                    if cmakestr.find(replace_key) == -1:
                        cmakestr_new = cmakestr.replace(search, replace)
                        # Only overwrite if necessary
                        if cmakestr_new != cmakestr:
                            f = open(filename, 'w')
                            f.write(cmakestr_new)
                            f.write("\n")
                            f.write(replace_key)
                            f.close()
                            replacement_performed = True
                    else:
                        replacement_performed = True
                if not replacement_performed:
                    bb.warn("No cmake replacements performed in %s for CMAKE_HIDE_ERROR[%s]" % (pn, flag))
}

do_populate_sysroot[vardeps] += "CMAKE_HIDE_ERROR"
# REVISIT: CMAKE_HIDE_ERROR cause configure rerun
sysroot_cleansstate[vardeps] += "CMAKE_HIDE_ERROR"
