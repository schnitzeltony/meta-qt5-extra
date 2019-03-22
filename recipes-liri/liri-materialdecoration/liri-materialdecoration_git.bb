SUMMARY = "Client-side decoration for all Qt-based Wayland clients"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.1.0+git${SRCPV}"

SRCREV = "2079487116c6c794af3a15452342a69293039b46"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${libdir}/plugins \
"
