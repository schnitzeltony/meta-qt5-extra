SUMMARY = "Qt port of libfm - a library to build desktop file managers"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt qt5-translation pkgconfig features_check cmake_lib mime

DEPENDS += "qtx11extras glib-2.0 libexif menu-cache libxcb liblxqt"

do_configure:append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*targets.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}

SRCREV = "b929719d615c8e3e67a73fd7a7d9b7c8362513ea"
PV = "1.1.0"

FILES:${PN} += " \
    ${datadir}/mime \
    ${datadir}/${BPN}/*.list \
"

RRECOMMENDS:${PN} = "gvfs gvfsd-trash eject"

CMAKE_ALIGN_SYSROOT[1] = "fm-qt, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
