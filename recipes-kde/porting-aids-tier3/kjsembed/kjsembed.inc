SUMMARY = "Embedded JS"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

# kde stuff takes care of native recipes
DEPENDS += "kjs ki18n kdoctools"

SRCREV = "361d5434b9ff286d8b4d7fab2cc2f2b77289496f"
PV = "5.5.0"
