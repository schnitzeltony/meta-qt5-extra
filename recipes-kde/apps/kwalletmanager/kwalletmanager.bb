SUMMARY = "KDE Wallet Manager is a tool to manage the passwords on your KDE system"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kcoreaddons \
    kdoctools \
    kauth \
    kwallet \
    kservice \
    kcmutils \
    kdelibs4support \
    ki18n \
    kxmlgui \
    kconfig \
    kconfigwidgets \
    kdbusaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "f8c1e5d07cb8f5439cfb27db497585cf"
SRC_URI[sha256sum] = "666e57d48099ae76a0f3b7022ab49a6d6e8d0ca3fcf780ca35cae7959d8b0135"
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
