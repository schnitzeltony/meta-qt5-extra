SUMMARY = "Secure and unified container for user passwords"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

DEPENDS += "libgcrypt gpgme kconfig kwindowsystem ki18n"

SRCREV = "85723c9c84a1a47e4e108de812183ac07656859b"

#EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5XmlGui, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5XmlGui, -S${includedir}, -S${STAGING_INCDIR}"
