SUMMARY = "Wallpapers for Liri OS"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.CCBYSAv4;md5=eacc0b19e3fb8dd12d2e110b24be0452 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "50935fae9989b9c99a0a18d350d841e72e6e29bc"
S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}"

RREPLACES_${PN} = "hawaii-wallpapers"
RPROVIDES_${PN} = "hawaii-wallpapers"
RCONFLICTS_${PN} = "hawaii-wallpapers"
