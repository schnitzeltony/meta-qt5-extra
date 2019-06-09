SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1a5d9e76abdfcaeb6db832bf8aea30c7"
SRC_URI[sha256sum] = "5eb34f3738821d9e3087150e34c8ff221cff70afd588eea8b80ce8315d5eb878"

FILES_${PN} += "${datadir}/dbus-1"
