SUMMARY = "Qt platform theme plugin for apps integration with Liri "
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

DEPENDS = " \
    liri-qtgsettings \
    liri-wayland \
"

inherit liri

PV = "1.0.0+git${SRCPV}"

SRCREV = "1dab05a1e6472956e25de16258ed04aa09dde348"
S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${libdir}/plugins \
"
