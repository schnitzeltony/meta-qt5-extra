SUMMARY = "KSYSGUARD"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext mime-xdg

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kdoctools-native \
    ki18n \
    kitemviews \
    knewstuff \
    kconfig \
    kiconthemes \
    kdelibs4support \
    libksysguard \
"

# REVISIT optionals
DEPENDS += " \
    lmsensors \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "27f1ef3c7d6b9fb6d9b70d676afc88b7"
SRC_URI[sha256sum] = "4acb352698b612a21a5eccf22042ab46265d50bbf3aa85844bbca762a64c9e2f"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${libdir}/libkdeinit5_ksysguard.so \
    ${OE_QMAKE_PATH_PLUGINS}/ksysguard \
"
