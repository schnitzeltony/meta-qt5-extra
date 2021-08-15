SUMMARY = "LIRI Calculator"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=8f0e2cd40e05189ec81232da84bd6e1a \
"

inherit liri qt5-translation gtk-icon-cache

DEPENDS += " \
    qtquickcontrols2 \
    liri-fluid \
"

SRCREV = "7dae77e72dd6cf1888ee546d8a2d9a2e815b123e"
S = "${WORKDIR}/git"
PV = "1.2.0+git${SRCPV}"

FILES:${PN} += " \
    ${datadir}/metainfo \
"
