SUMMARY = "LIRI Web browser"
LICENSE = "BSD-3-Clause & GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.BSD;md5=45ba01a83fedf3882c6bb7f5c8eb7a6c \
	file://LICENSE.GPLv3;md5=8f0e2cd40e05189ec81232da84bd6e1a \
"

inherit liri gtk-icon-cache

PV = "0.0.0+git${SRCPV}"

SRCREV = "c914ffea326f24dcf8fd7ed799c4d001bd099ce3"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtsvg \
    qtgraphicaleffects \
    qtwebengine \
    liri-fluid \
"

do_configure_prepend() {
    export PREFIX=${prefix}
}

# No links -> runtime dependency
RDEPENDS_${PN} += " \
    slime-engine \
"
