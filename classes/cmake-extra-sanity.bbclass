do_install_append() {
    # avoid strange prefixing seen often
    old_dir=`pwd`
    cd ${D}
    if grep -qr 'usr\/\/usr' ; then
        bbfatal 'usr//usr found in ${PN} - check sources for PREFIX or better CMAKE_INSTALL_PREFIX!'
    fi
    cd $old_dir
}
