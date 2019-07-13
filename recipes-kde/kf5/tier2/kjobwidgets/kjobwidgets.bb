SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "03b511db466b456db8543b8732ecdb8a"
SRC_URI[sha256sum] = "b9d2a044a17eff6ced2cf6c4bd06661a0d64cbeea2b18248cdac4f969ea69353"

FILES_${PN} += "${datadir}/dbus-1"
