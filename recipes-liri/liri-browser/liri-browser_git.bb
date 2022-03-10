SUMMARY = "LIRI Web browser"
LICENSE = "BSD-3-Clause & GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.BSD;md5=45ba01a83fedf3882c6bb7f5c8eb7a6c \
	file://LICENSE.GPLv3;md5=8f0e2cd40e05189ec81232da84bd6e1a \
"

inherit liri gtk-icon-cache

PV = "0.0.0+git${SRCPV}"

SRCREV = "ae9d3d6a7a39ec4a8a2af33ead7d31ecbb2db65c"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtsvg \
    qtgraphicaleffects \
    qtwebengine \
    liri-fluid \
"

do_configure:prepend() {
    export PREFIX=${prefix}
}

# No links -> runtime dependency
RDEPENDS:${PN} += " \
    slime-engine \
"
