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
    kdoctools-native \
    kdesignerplugin-native \
    kdelibs4support-native \
    sonnet-native \
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
SRC_URI[md5sum] = "7ee403f13708ec9f16deb28e665e987f"
SRC_URI[sha256sum] = "a64cbe07168e5e67bb4ea2d3394c12ac73c84d4df560038e476146d9f98bfa32"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_kmenuedit.so \
    ${libdir}/kconf_update_bin \
"
