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
SRC_URI[md5sum] = "fab59cb7f271d1e6c4786c3c944b6494"
SRC_URI[sha256sum] = "ed9bccff28f62aadf201ab6c88f35eda997bd1ccc2d4c3d259216af740753528"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_ksysguard.so \
"

FILES_${PN}-dbg += " \
"
