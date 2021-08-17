SUMMARY = "KDE graphical diskspace analyser"
LICENSE = "GFDL-1.2 & GPL-2.0-only & GPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9f58808219e9a42ff1228309d6f83dc6 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
"

inherit kde-apps gettext mime-xdg

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    sonnet-native \
    kio \
    kparts \
    solid \
    kxmlgui \
    ki18n \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "785066457381086a3fa87e8df423632b029510d3c71efa8e8563e667c63c48f4"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
