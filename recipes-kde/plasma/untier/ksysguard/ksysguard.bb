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
SRC_URI[md5sum] = "f3ee0ba2998d7f9b730dbb07bc76aa72"
SRC_URI[sha256sum] = "a14eb280fc6dad54962db3a71e93c25b73f31e289e29e960ce4fbffee700a14d"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${libdir}/libkdeinit5_ksysguard.so \
"

FILES_${PN}-dbg += " \
"
