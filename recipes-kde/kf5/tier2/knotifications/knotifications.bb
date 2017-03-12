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
    kiconthemes \
    kcodecs \
    kcoreaddons \
    phonon \
    libdbusmenu-qt5 \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras libxtst", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c26b2986b9e0bde913dbe34d9e550bb6"
SRC_URI[sha256sum] = "9e0caf8599093e7c23bf0baa5f95d776f864a85f4d419bf14dc45fc1503d5719"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/kservicetypes5"
