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
SRC_URI[sha256sum] = "b9b86fce869a1f084bf1af4917228acb34dc99cb0079a7e79908e8c7b92256f5"
SRC_URI += "file://0001-fix-build-for-qtbase-without-session-management.patch"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/kde4 \
    ${libdir}/libkdeinit5_khelpcenter.so \
"

RDEPENDS_${PN} += "perl"
