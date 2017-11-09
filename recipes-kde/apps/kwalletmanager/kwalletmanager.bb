SUMMARY = "KDE Wallet Manager is a tool to manage the passwords on your KDE system"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kcoreaddons-native \
    kdoctools-native \
    kauth-native \
    kconfig-native \
    sonnet-native \
    kwallet \
    kservice \
    kcmutils \
    kdelibs4support \
    ki18n \
    kxmlgui \
    kconfig-native \
    kconfigwidgets \
    kdbusaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "cafbbbe3fcb934c1ae6991c12f9cbbdb"
SRC_URI[sha256sum] = "d98c399899502cb168a351b6d699b0bfd26c4614c34b6c64a7e346a33dd7f9bd"
SRC_URI += "file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${libdir}/kauth \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${libdir}/kauth/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
