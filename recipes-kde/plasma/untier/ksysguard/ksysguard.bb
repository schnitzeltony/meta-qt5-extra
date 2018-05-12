SUMMARY = "KSYSGUARD"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext

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
SRC_URI[md5sum] = "25bfe4cb9bbb782c938f92963ca1cd59"
SRC_URI[sha256sum] = "1b5b81c9818881edcd4b366801a67583ebdd6444aa20a55ccb52eed1a7269087"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_ksysguard.so \
"

FILES_${PN}-dbg += " \
"
