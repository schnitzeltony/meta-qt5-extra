SUMMARY = "Ark is KDE's file archiver"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.icons;md5=6e01bfa20e899e8ad569d5488923cbd2 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    libarchive \
    karchive \
    kconfig \
    kcrash \
    kdbusaddons \
    kdoctools \
    ki18n \
    kiconthemes \
    khtml \
    kio \
    kservice \
    kpty \
    kwidgetsaddons \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "5e2a515035d7fa7dc6de3e8464c5da6e"
SRC_URI[sha256sum] = "ca24cede837c4b3a9b84604651a2d4d5cf548aeaa27cb1c897ac79998398c174"
SRC_URI += "file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/kio_dnd/.debug \
"
