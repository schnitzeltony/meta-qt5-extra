SUMMARY = "KDE document viewer"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    libkexiv2 \
    qca \
    tiff \
    kpty \
    poppler \
    kactivities \
    karchive \
    kbookmarks \
    kcompletion \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    kdoctools \
    kiconthemes \
    kjs \
    kio \
    kparts \
    threadweaver \
    kwallet \
    khtml \
    kwindowsystem \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "64df40864ed7a447b19966c1c376d78c"
SRC_URI[sha256sum] = "6c8aa4eb80ff27dee18a49b71f7a336bc4ab19b69fa234e431e046e629371f08"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/config.kcfg \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org \
"
