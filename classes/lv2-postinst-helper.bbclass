# Helper class to handle ontarget-postinst creation of lv2 turtle files

# File created during compile usually. To create this file makefiles have to be
# aligned - see do_configure_prepend at zynaddsubfx or distrho-ports. The file
# is expected with the following format
# lv2-ttl-generator <path>/plugin.so
LV2-TURTLE-BUILD-DATA = "${WORKDIR}/lv2-ttl-generator-data"

# E.g zynaddsubfx needs to create dummy lv2 turtle files to keep install sane.
# To delete them automatically (see below) the contain a dummy string:
LV2-DUMMY-TURTLE-STR = "lv2-dummy-turtle-string"

# To make ontarget postinst/prerm happen, the names of all plugins with their
# paths as installed on target a stored in a file called lv2-postinst-manifest
LV2-POSTINST-MANIFEST = "${datadir}/${BPN}/lv2-postinst-manifest"

do_install_append() {
    # remove dummy lv2-turtles again
    cd ${D}/${libdir}/lv2
    for tfile in `grep -rl ${LV2-DUMMY-TURTLE-STR}`; do
        rm $tfile
    done

    # create postinst manifest
    install -d ${D}`dirname ${LV2-POSTINST-MANIFEST}`
    for sofile in `cat ${LV2-TURTLE-BUILD-DATA} | awk '{ print $2 }'`; do
        sofile=`basename $sofile`
        installed=`find ${D}${libdir}/lv2 -name $sofile | sed 's|${D}||g'`
        echo $installed >> ${D}${LV2-POSTINST-MANIFEST}
    done
}


pkg_postinst_ontarget_${PN}-lv2() {
    oldpath=`pwd`
    for sofile in `cat ${LV2-POSTINST-MANIFEST}`; do
        cd `dirname "$sofile"`
        lv2-ttl-generator "$sofile"
    done
    cd $oldpath
}

pkg_prerm_${PN}-lv2() {
    for sofile in `cat ${LV2-POSTINST-MANIFEST}`; do
        path=`dirname "$sofile"`
        for turtle in `find $path -name '*.ttl'`; do
            rm $turtle
        done
    done
}

FILES_${PN}-lv2 += "${LV2-POSTINST-MANIFEST}"
RDEPENDS_${PN}-lv2 += "lv2-ttl-generator"
