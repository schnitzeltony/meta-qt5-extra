SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "35a2aab2c77cc73fac41f3ae0b2c8532"
SRC_URI[sha256sum] = "07e2381ba46d56b010bc6615e8e7be900bd39f754ac1044180608dbb23967733"
