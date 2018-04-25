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
SRC_URI[md5sum] = "b98e3af1dd53c91dee83533350443b11"
SRC_URI[sha256sum] = "6920efdccd698fc83849af211473780364d9cf18548c5e9b3bcf207b9ea3d866"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
