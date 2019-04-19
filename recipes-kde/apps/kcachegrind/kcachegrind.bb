SUMMARY = "GUI to profilers such as Valgrind"
HOMEPAGE = "https://kcachegrind.github.io/html/Home.html"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gettext gtk-icon-cache

DEPENDS += "\
    kcoreaddons-native  \
    kdoctools-native \
    ki18n-native \
    kauth-native \
    kconfig-native \
    karchive \
    kwidgetsaddons \
    kxmlgui \
    kio \
    kdbusaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "09890b38b9270e4f114777929e38ca9e"
SRC_URI[sha256sum] = "7021ac1b133e86692dad92ff8de6a0467c2b488d7e5c2977ee4880c166e088ca"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
"

RRECOMMENDS_${PN} += "graphviz"
