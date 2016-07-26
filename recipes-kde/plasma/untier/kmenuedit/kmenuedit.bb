SUMMARY = "KMENUEDIT"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

DEPENDS += " \
    ki18n \
    kxmlgui \
    kdbusaddons \
    kiconthemes \
    kio \
    sonnet \
    kdelibs4support \
"

# REVISIT optionals
DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "khotkeys", "",d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "165acf6e30bb45c2e2da74b162ce0d4e"
SRC_URI[sha256sum] = "b783db11382b3b46db16f09e4c412ebad687f70923200a0e2cd36a3a60d75b2d"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_kmenuedit.so \
"
