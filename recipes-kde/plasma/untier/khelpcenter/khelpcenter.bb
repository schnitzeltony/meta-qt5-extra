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
SRC_URI[md5sum] = "636ee9a9a68bba1b8b811c8d78f9a87f"
SRC_URI[sha256sum] = "1a2cb19a725728b30bb88390f77018e4ed3f3e57dba5a9db171430a53bb29a2a"

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
