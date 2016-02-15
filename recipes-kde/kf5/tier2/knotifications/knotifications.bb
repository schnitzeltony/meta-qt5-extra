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
SRC_URI[md5sum] = "c5efd59dd9f2687aa2efae4a5356ce9f"
SRC_URI[sha256sum] = "5b116ba498ed57dbc33ef9a7f24c0571f52b03bd986a7b8e14f799a039a82f3f"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Notifications, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Notifications, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
