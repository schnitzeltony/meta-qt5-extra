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
SRC_URI[md5sum] = "02a5a0ab816fff398062363217ff7c45"
SRC_URI[sha256sum] = "c2fd45fa386d3d10a91045eaf017fda974a3762f7bfcb9a7ab2666c347193336"

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
