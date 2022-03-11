SUMMARY = "Wallpapers for Liri OS"
LICENSE = "CC-BY-SA-4.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.CCBYSAv4;md5=eacc0b19e3fb8dd12d2e110b24be0452 \
"

inherit liri

PV = "0.10.0+git${SRCPV}"

SRCREV = "0087dca3273dac17a71eefa122e0ecf7a4dfba02"
S = "${WORKDIR}/git"

FILES:${PN} += "${datadir}"
