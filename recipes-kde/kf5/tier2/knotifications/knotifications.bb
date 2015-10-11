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
SRC_URI[md5sum] = "f7ee1756a658c3c41328369dcc7701db"
SRC_URI[sha256sum] = "958d2c98563e3de0bf49490a931e95100efa06f91647eb1d1523c5a252ef0985"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Notifications, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Notifications, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
