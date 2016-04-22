SUMMARY = "Application to show KDE Applications' documentation"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7108e5acd7ce861dee282297d7c2f38c \
"

inherit kde-apps

DEPENDS += " \
    grantlee \
    karchive \
    kbookmarks \
    kconfig \
    kcoreaddons \
    kdbusaddons \
    kdoctools \
    ki18n \
    kinit \
    khtml \
    kservice \
    kwindowsystem \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "d7e35c9bb891dfa102f0d217e57e99c5"
SRC_URI[sha256sum] = "feaa2dbdc6731867739d58cba50754cebb1caf593ff8bf687a0d03669bf6cae4"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
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
