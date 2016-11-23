SUMMARY = "KDE graphical diskspace analyser"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=e098acff086ea3d1264fc89b51242144 \
    file://COPYING-DOCS;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += "\
    kio \
    kparts \
    solid \
    kxmlgui \
    kcoreaddons \
    kdoctools \
    ki18n \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "8d8deda9bd3b1c74bedf8b3ef9f1fc95"
SRC_URI[sha256sum] = "50cedd1bdc674c6398075945fa99e12c5e67b1b40d7534b03d43eca5d8300c1e"
SRC_URI += " \
    file://0001-do-not-build-docs.patch \
    file://0002-fix-build-for-qtbase-build-without-session-support-Q.patch \
"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
