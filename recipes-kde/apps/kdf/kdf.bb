SUMMARY = "KDiskFree displays the file devices' information"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons-native \
    kdoctools-native \
    ki18n \
    kiconthemes \
    kio \
    kcmutils \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "c19edb217b875bbc2e2d3c1c09cfdc87"
SRC_URI[sha256sum] = "f1204fddefe5492c860a77ff2c343f9b885625b321a37673763d73510dd469fd"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
