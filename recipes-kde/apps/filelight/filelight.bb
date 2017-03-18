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
SRC_URI[md5sum] = "fc6cc77d6e4d409db7c9175398d363ce"
SRC_URI[sha256sum] = "3a8e0999d8ffc2edf0624482ecf1cc3b3586bdbc7e5431bc4b71e09f78e8ec8d"
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
