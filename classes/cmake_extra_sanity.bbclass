inherit cmake_sysroot

# do_install:append:class-cross does not work so hack
do_install:prepend:class-native() {
    no_staging_check=true
}

do_install:prepend:class-nativesdk() {
    no_staging_check=true
}

do_install:append() {
    # avoid strange prefixing seen often
    old_dir=`pwd`
    cd ${D}
    if grep -qr 'usr\/\/usr' ; then
        bbfatal 'usr//usr found - check sources for PREFIX or better CMAKE_INSTALL_PREFIX!'
    fi
    cd $old_dir

    # check for staging links in non native recipes
    # TBD: -> oe-core (1st part - genarated sources - should work with autotools too)
    if [ x = x$no_staging_check ] ; then
        error=
        # check for genarated sources
        for f in `find ${B} -name '*.h' -o -name '*.cpp'` ; do
            if grep -q 'recipe-sysroot' $f ; then
                bbwarn "$f contains links to build sysroot!"
                error=true
            fi
        done

        # check installed cmake files
        for f in `find ${D} -name '*.cmake'` ; do
            if grep -q 'recipe-sysroot' "$f" ; then
                bbwarn "$f contains links to build host sysroot!"
                error=true
            fi

        done

        if [ x != x$error ] ; then
            bbfatal "One or more files contain links to build host sysroot ${STAGING_DIR}"
        fi
    fi
}

do_populate_sysroot[postfuncs] += "do_sysroot_cmake_sanity "

# check sysroot cmake files for links not relative and not to sysroots

do_sysroot_cmake_sanity() {
    error=
    for f in `cat ${CMAKEINSTALLED}` ; do
        if grep -q ';${libdir}' "$f" ; then
            bbwarn "$f contains links to ${libdir}!"
            error=true
        fi
        if grep -q '\"${libdir}/lib' "$f" ; then
            bbwarn "$f contains links to ${libdir}!"
            error=true
        fi
        if grep -q ';${includedir}' "$f" ; then
            bbwarn "$f contains links to ${includedir}!"
            error=true
        fi
        if grep -q '\"${includedir}' "$f" ; then
            bbwarn "$f contains links to ${includedir}!"
            error=true
        fi
    done
    if [ x != x$error ] ; then
        bbfatal "One or more files in sysroot contain links to ${prefix}"
    fi
}
