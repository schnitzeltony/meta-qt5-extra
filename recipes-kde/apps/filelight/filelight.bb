SUMMARY = "KDE graphical diskspace analyser"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=e098acff086ea3d1264fc89b51242144 \
    file://COPYING-DOCS;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

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
SRC_URI[md5sum] = "6fa0d265e40841fca313aa631de1931b"
SRC_URI[sha256sum] = "95fa38574292a2aa8d3d90749fbbb61c5005889ef1df1aaa04d2d789bbf4fb00"
SRC_URI += " \
    file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch \
"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
