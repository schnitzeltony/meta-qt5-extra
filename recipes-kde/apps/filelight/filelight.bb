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
SRC_URI[md5sum] = "ad2eb07a1e535a183d8bb2d06dd46ea3"
SRC_URI[sha256sum] = "170e633e0d2f8c9b13cccfd5957590100be435f9e7258e84c6f15fabc636768e"
SRC_URI += " \
    file://0001-fix-build-for-qtbase-build-without-session-support-Q.patch \
"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
