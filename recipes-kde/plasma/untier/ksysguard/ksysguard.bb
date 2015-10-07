SUMMARY = "KSYSGUARD"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma

DEPENDS += " \
    kcoreaddons \
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
SRC_URI[md5sum] = "7551c199c5caffda59363757bbc57243"
SRC_URI[sha256sum] = "d50dfc6f750404489b3759045ca727859678b65c085382c22907f0214ef9c7b3"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_ksysguard.so \
"

FILES_${PN}-dbg += " \
"
