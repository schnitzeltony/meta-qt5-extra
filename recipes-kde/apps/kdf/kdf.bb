SUMMARY = "KDiskFree displays the file devices' information"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kconfigwidgets \
    kcoreaddons \
    kdoctools \
    ki18n \
    kiconthemes \
    kio \
    kcmutils \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "30b6a16f57cb3b779a3a23d35ed42c9c"
SRC_URI[sha256sum] = "8c7da699d2a6a8c2d1b05901ea49bbd7ce3ae7a6af31b198a9ffc96c4bc91c6a"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
