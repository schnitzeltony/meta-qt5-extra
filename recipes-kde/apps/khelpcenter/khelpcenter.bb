SUMMARY = "Application to show KDE Applications' documentation"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7108e5acd7ce861dee282297d7c2f38c \
"

inherit kde-apps

DEPENDS += " \
    grantlee \
    xapian-core \
    \
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
SRC_URI[md5sum] = "6e99c634ce264809d333f59920644d90"
SRC_URI[sha256sum] = "a74a1997feae8abdb3c00ad6afbc9cb1679a6a9ad4afe61f5ff0eb25a5641d80"

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
