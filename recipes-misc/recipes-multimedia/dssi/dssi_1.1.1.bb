SUMMARY = "DSSI is an audio plugin API for soft synths and effects"
HOMEPAGE = "http://dssi.sourceforge.net"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=9f46aa1ea6e91bb339e8fa2f11d17e4d"

inherit autotools pkgconfig

DEPENDS += " \
    jack \
    libsndfile1 \
    libsamplerate0 \
    liblo \
    ladspa-sdk \
"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "619ab73c883b02dc37ddb37001591f8b"
SRC_URI[sha256sum] = "f2c82b073a947c8255284249097667f9b14e660bf86186f3fcd3b3b3e087814e"

PACKAGES =+ "${PN}-examples"
FILES_${PN}-examples = " \
    ${bindir}/dssi_* \
    ${bindir}/karplong \
    ${bindir}/*trivial* \
    \
    ${libdir}/dssi/*.so \
"
