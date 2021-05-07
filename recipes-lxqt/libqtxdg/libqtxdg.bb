SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

# libmagic is supplied by file
DEPENDS += " \
    qtsvg \
    file \
"

EXTRA_OECMAKE += " \
    -DQTXDGX_ICONENGINEPLUGIN_INSTALL_PATH=${OE_QMAKE_PATH_PLUGINS}/iconengines \
"

SRCREV = "6b8157ab2a6429fc1655422bffd0ff0171b58525"
PV = "3.7.1"

do_configure_append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*-targets.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/iconengines"
