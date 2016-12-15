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
SRC_URI[md5sum] = "0ee9fe4729f58e512c6fe71359c8945c"
SRC_URI[sha256sum] = "12dc0427940e674030693f80638358e2e33e54e6dc0108d2426add0ba41fba04"

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
