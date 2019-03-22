SUMMARY = "LIRI Calculator"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=8f0e2cd40e05189ec81232da84bd6e1a \
"

inherit liri gtk-icon-cache

DEPENDS += " \
    qtquickcontrols2 \
    liri-fluid \
"

SRCREV = "7caf7cf9ede6729f71de54ce6e8ed678056b8530"
S = "${WORKDIR}/git"
PV = "1.2.0+git${SRCPV}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/icons \
"
