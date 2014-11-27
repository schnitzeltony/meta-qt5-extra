SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

SRCREV = "4f6d10cdc59aca6819e4189e81ff65150559bc10"
PV = "5.5.0"

FILES_${PN} += "${datadir} ${libdir}/plugins"
FILES_${PN}-dbg += "${libdir}/plugins/*/.debug"
