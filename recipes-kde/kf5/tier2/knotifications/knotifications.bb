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
SRC_URI[md5sum] = "4865198f8406068c67254ee3b59faab4"
SRC_URI[sha256sum] = "5a388e05ae3416a5120c268e48fa505e6666403772e8f03fe4670ab1d0bb0469"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
