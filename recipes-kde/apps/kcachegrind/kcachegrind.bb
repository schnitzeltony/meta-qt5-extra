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
SRC_URI[md5sum] = "447466379d5a9d30edab30e048532c61"
SRC_URI[sha256sum] = "676dd522eb9976789da17eea1dc103c9c67b6df7bfa70d998e29c0e7dde0608b"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
"

RRECOMMENDS_${PN} += "graphviz"
