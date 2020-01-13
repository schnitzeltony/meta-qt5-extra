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
SRC_URI[md5sum] = "09426db5acb6e2e148bbe95982c9e7dc"
SRC_URI[sha256sum] = "aad3697a35109fad49fa286b7837d382599478bac33151cd7991c760866c12c1"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
