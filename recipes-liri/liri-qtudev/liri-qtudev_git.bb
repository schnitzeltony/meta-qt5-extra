SUMMARY = "Qt-style wrapper around udev"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.0.0+git${SRCPV}"

SRCREV = "ba2d937bb08c39fa40a1fc4037366bf8699e1133"
S = "${WORKDIR}/git"

DEPENDS += " \
    udev \
    umockdev \
"

FILES_SOLIBSDEV = ""
FILES_${PN} += " \
    ${libdir}/libQt5Udev.so \
"
