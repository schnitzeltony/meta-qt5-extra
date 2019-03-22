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
SRC_URI[md5sum] = "7af7f7f466600d08ca11aa1f24e9c977"
SRC_URI[sha256sum] = "5b4a9ed17d0898c74cf7fd1612e2d055086d5e04148b3b17df5977255fc240b8"

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
