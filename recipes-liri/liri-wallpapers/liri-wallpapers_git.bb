SUMMARY = "Wallpapers for Liri OS"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.CCBYSAv4;md5=eacc0b19e3fb8dd12d2e110b24be0452 \
"

inherit liri

PV = "0.10.0+git${SRCPV}"

SRCREV = "9f34bae8032a221e7c1af78a401e28095abd21f3"
S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}"

RREPLACES_${PN} = "hawaii-wallpapers"
RPROVIDES_${PN} = "hawaii-wallpapers"
RCONFLICTS_${PN} = "hawaii-wallpapers"
