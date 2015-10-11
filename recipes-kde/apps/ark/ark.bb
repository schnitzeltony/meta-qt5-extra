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
SRC_URI[md5sum] = "b868106c24b5cecb98a18d09d7039943"
SRC_URI[sha256sum] = "1496e70b0295054cfca217f6a80737c693be952bfa3873954fdb10d7708ab852"
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
