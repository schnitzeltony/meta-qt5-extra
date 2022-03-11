SUMMARY = "Qt-style wrapper around udev"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.1.0+git${SRCPV}"

SRCREV = "dfe043f681beacc561db32c6fa4cb8a0fa9729a2"
S = "${WORKDIR}/git"

DEPENDS += " \
    udev \
    umockdev \
"
