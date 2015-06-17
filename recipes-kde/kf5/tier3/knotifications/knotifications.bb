SUMMARY = "Abstraction for system notifications"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    kwindowsystem \
    kservice \
    kconfig \
    kiconthemes \
    kcodecs \
    kcoreaddons \
    phonon \
    libdbusmenu-qt5 \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "40435109ce5d9384aaf87d09396cdb4c"
SRC_URI[sha256sum] = "04db2e0c21907dc5252e44a65233b432fff38dd051d9446515665d9c1f8f129f"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Notifications, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Notifications, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
