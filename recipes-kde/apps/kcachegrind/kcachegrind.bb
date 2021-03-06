SUMMARY = "GUI to profilers such as Valgrind"
HOMEPAGE = "https://kcachegrind.github.io/html/Home.html"
LICENSE = "GPL-2.0 & GFDL-1.2"
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
SRC_URI[sha256sum] = "95e18b85ae69a522f1f0047960c2dbcc2553af284d18b45d5373746a7e5f69ea"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
"

RRECOMMENDS_${PN} += "graphviz"
RDEPENDS_${PN} += "perl"
