SUMMARY = "Client-side decoration for all Qt-based Wayland clients"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.1.0+git${SRCPV}"

SRCREV = "6eb7686bb0538d815f52d6bb96a415d41e15b636"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${libdir}/plugins \
"
