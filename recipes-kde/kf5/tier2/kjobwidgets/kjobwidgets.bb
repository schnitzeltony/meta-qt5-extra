SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "92b86b2b57098ee0e67b648224e82abb"
SRC_URI[sha256sum] = "0410329ed4d99c726fbb05f1701b9837e5bf2da6a554b74bfe45b1c7558b586e"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5JobWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5JobWidgets, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1"
