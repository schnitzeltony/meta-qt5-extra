SUMMARY = "Abstraction for system notifications"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kwindowsystem kservice kconfig kiconthemes kcodecs kcoreaddons phonon"
DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b610f0a52530f6ced9ea5cc206c39d7a"
SRC_URI[sha256sum] = "43242ba806feedb226b77c414bcc5fc20cbb37c83ac006949725265b83d02b7d"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Notifications, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Notifications, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
