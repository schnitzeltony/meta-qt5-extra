SUMMARY = "Abstraction for system notifications"
LICENSE = "MIT & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
"

inherit kde-kf5

DEPENDS += " \
    kwindowsystem \
    kservice \
    kconfig \
    kconfig-native \
    kiconthemes \
    kcodecs \
    kcoreaddons \
    kcoreaddons-native \
    phonon \
    libdbusmenu-qt5 \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras libxtst", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "701cb194b16efd02a081df2d958513b5"
SRC_URI[sha256sum] = "646bd3bac073fbf4f19f9047360325c933751d605cf1311f4c922d7457fbda51"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
