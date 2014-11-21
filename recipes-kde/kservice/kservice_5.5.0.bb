DESCRIPTION = "Reading, creating, and manipulating file archives"
LICENSE = "BSD & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde
#cmake-lib

#CMAKE_HIDE_ERROR[dir1] = "KF5I18n/KF5I18nTargets.cmake, -cccoutforoe filecheckloop"

#DEPENDS += "qtscript"

SRCREV = "91311e0b348f73713b5b2d5721c46b75207a5a7b"
