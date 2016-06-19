SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5d11070cecef697c44b13fa5f9c3a925"
SRC_URI[sha256sum] = "be950bed77571d916f745b25d264e554ee6ba8e2180cd3601ed27f4f3117e0b2"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5JobWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5JobWidgets, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1"
