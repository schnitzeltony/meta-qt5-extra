# do_install_append_class-cross does not work so hack
do_install_prepend_class-native() {
    no_staging_check=true
}

do_install_prepend_class-nativesdk() {
    no_staging_check=true
}

do_install_append() {
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
            if grep -q '${STAGING_DIR}' $f ; then
                bbwarn "$f contains links to build host sysroot!"
                error=true
            fi
        done

        # check installed cmake files
        for f in `find ${D} -name '*.cmake'` ; do
            if grep -q '${STAGING_DIR}' "$f" ; then
                bbwarn "$f contains links to build host sysroot!"
                error=true
            fi
        done

        if [ x != x$error ] ; then
            bbfatal "One or more files contain links to build host sysroot ${STAGING_DIR}"
        fi
    fi
}
