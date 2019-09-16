SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "783f88d96a7cd09023efcb65f31c639b"
SRC_URI[sha256sum] = "e3607167361fdd6874a165881de523505bd00d8fabb755abf62114c017a39c93"

FILES_${PN} += "${datadir}/dbus-1"
