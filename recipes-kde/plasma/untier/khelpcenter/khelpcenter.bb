SUMMARY = "Application to show KDE Applications' documentation"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7108e5acd7ce861dee282297d7c2f38c \
"

inherit kde-plasma

DEPENDS += " \
    kconfig \
    kinit \
    kcmutils \
    khtml \
    kdelibs4support \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "99df60a8b2cc2b5c0f924a7c36cd9ad3"
SRC_URI[sha256sum] = "a9a78071574151a1edac0e0c89a97b55e7394cf2ab88ec7cbb92070585fd5a85"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
    file://0002-fix-path-to-khc_indexbuilder.patch \
"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/kde4 \
    ${libdir}/libkdeinit5_khelpcenter.so \
"
