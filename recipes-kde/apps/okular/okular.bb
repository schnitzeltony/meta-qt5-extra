SUMMARY = "KDE document viewer"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=d8855fca80aa0b428deafa405d0ea17a \
"

inherit kde-apps gtk-icon-cache

SRC_URI += "file://0001-Do-not-build-docs.patch"

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
SRC_URI[md5sum] = "adde29b7f7aafb55349781e0a0a5525b"
SRC_URI[sha256sum] = "ff3d2eac444a110a611add71c30b0556085f5aaccdd821a80bd070a646c9f6b3"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/config.kcfg \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org \
"
