SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

SRCREV = "64e6dfdeb206a2d0623ee1d54104c907625bcde4"
PV = "5.5.0"

# required
DEPENDS += " \
	qttools \
	kcoreaddons \
	kconfig \
	kdoctools \
"

