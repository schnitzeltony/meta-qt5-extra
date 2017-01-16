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
SRC_URI[md5sum] = "2bac6bc332a44b9120ec1b7b8dbcc583"
SRC_URI[sha256sum] = "f8a44821c01f84a8554f0d58e32bf6f351dd2d6ecb7e22b0544a40ebeb1e5d7d"
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
