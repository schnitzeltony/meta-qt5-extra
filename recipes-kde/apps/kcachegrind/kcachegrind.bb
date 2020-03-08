SUMMARY = "GUI to profilers such as Valgrind"
HOMEPAGE = "https://kcachegrind.github.io/html/Home.html"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gettext gtk-icon-cache mime-xdg

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
SRC_URI[md5sum] = "fb3c55fed53a932358a7ddcf4d12f7ad"
SRC_URI[sha256sum] = "a30b70bac32f2b33c3c90b8c17754cfbf7d293c9eff0d573747eca2b45353b41"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
"

RRECOMMENDS_${PN} += "graphviz"
RDEPENDS_${PN} += "perl"
