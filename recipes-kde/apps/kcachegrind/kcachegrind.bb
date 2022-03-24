SUMMARY = "GUI to profilers such as Valgrind"
HOMEPAGE = "https://kcachegrind.github.io/html/Home.html"
LICENSE = "GFDL-1.2 & GPL-2.0-only & LGPL-2.1-only & LGPL-3.0-only & Qt-LGPL-exception-1.1"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/Qt-LGPL-exception-1.1.txt;md5=bb426f3367c4805d1e12fad05bd0b750 \
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
SRC_URI[sha256sum] = "ddcf3722211d47c90616528607ebc4573835faa52a57e2e9d6763968b9975ab3"

FILES:${PN} += " \
    ${datadir}/kxmlgui5 \
"

RRECOMMENDS:${PN} += "graphviz"
RDEPENDS:${PN} += "perl"
