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
SRC_URI[sha256sum] = "e6b84a323a21ae7975ccc07154bcdc6eef1bc92818b800cfc5d546ada7f0387c"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
"

RRECOMMENDS_${PN} += "graphviz"
RDEPENDS_${PN} += "perl"
