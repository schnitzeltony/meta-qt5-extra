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
SRC_URI[sha256sum] = "db2004c06c2ae95f007ade9244d161bb140b3012776cce0f0f1fcf7a0cc3d7ad"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
