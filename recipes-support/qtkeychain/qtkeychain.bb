SUMMARY = "Platform-independent Qt API for storing passwords securely"
HOMEPAGE = "https://github.com/frankosterfeld/qtkeychain"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c262c13b60ebefe3060aed37d334ab6"

DEPENDS = " \
    qttools-native \
    qttools \
    qtbase \
"

QT_TRANSLATION_FILES = "${datadir}/qt5keychain/translations/*.qm"

inherit cmake_qt5_extra qt5-translation

SRC_URI = "git://github.com/frankosterfeld/${BPN}.git"
SRCREV = "815fe610353ff8ad7e2f1121c368a74df8db5eb7"
PV = "0.12.0"
S = "${WORKDIR}/git"

do_install:append() {
    # mkspecs are installed at the wrong place. So as long as there are no
    # consumers building with qmake, delete mkspecs
    rm -rf ${D}${prefix}/mkspecs
}
