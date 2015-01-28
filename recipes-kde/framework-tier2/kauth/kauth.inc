SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
	file://0002-align-installation-location-for-helpers.patch \
"
SRCREV = "9f162d6ef8cc5b5d468b9ba2092684b9b256e089"
PV = "5.7.0"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
