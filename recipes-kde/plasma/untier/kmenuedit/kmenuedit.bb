SUMMARY = "KMENUEDIT"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    ki18n \
    kxmlgui \
    kdbusaddons \
    kiconthemes \
    kio \
    sonnet \
    sonnet-native \
    kdelibs4support \
    kdelibs4support-native \
    kdesignerplugin-native \
"

# REVISIT optionals
DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "khotkeys", "",d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "18f6f9117724fd8bcc1b88600fd7fe3b"
SRC_URI[sha256sum] = "12d8fc839d584c4824e7f61f98af2bacdc7b622257620401e983bb0fce0fded5"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_kmenuedit.so \
"
