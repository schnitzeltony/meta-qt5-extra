SUMMARY = "KDE document viewer"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=d8855fca80aa0b428deafa405d0ea17a \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    ki18n-native \
    kconfig-native \
    kauth-native \
    kcoreaddons-native \
    kdoctools-native \
    sonnet-native \
    libkexiv2 \
    qca \
    tiff \
    kpty \
    poppler \
    kactivities \
    karchive \
    kbookmarks \
    kcompletion \
    kconfigwidgets \
    kdbusaddons \
    kiconthemes \
    kirigami2 \
    purpose \
    kjs \
    kio \
    ki18n \
    kparts \
    threadweaver \
    kwallet \
    khtml \
    kwindowsystem \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "b4f1115022ec0c421d7a6b25a5535eda"
SRC_URI[sha256sum] = "10e29f50f7616b4784ce673ef7fd6c04d622b02c175f96cd127a99cc5cffa9bc"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/config.kcfg \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org \
"
