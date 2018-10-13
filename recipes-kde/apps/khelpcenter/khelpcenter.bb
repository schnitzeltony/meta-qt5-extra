SUMMARY = "Application to show KDE Applications' documentation"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7108e5acd7ce861dee282297d7c2f38c \
"

inherit kde-apps gettext

DEPENDS += " \
    grantlee \
    xapian-core \
    \
    kauth-native \
    karchive \
    kbookmarks \
    kconfig-native \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools-native \
    ki18n \
    kinit \
    khtml \
    kservice \
    kwindowsystem \
    sonnet-native \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "eb5ebdbff5ce3a18fb52634e337d3c6c"
SRC_URI[sha256sum] = "6aa449cadceda3f303012a3cea4a2d38b5a1286ccd4c62cf779d25e168780bcb"

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
