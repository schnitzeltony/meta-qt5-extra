SUMMARY = "Wallpapers for Liri OS"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.CCBYSAv4;md5=eacc0b19e3fb8dd12d2e110b24be0452 \
"

inherit liri

PV = "0.10.0+git${SRCPV}"

SRCREV = "c721e5b19467643df31cea4a78db132f5d3f851e"
S = "${WORKDIR}/git"

FILES:${PN} += "${datadir}"

RREPLACES:${PN} = "hawaii-wallpapers"
RPROVIDES:${PN} = "hawaii-wallpapers"
RCONFLICTS:${PN} = "hawaii-wallpapers"
