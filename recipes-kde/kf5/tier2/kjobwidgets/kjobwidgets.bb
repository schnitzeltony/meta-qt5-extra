SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f26fc58203dcad45d3c20545c5a48e53"
SRC_URI[sha256sum] = "af0c5a67ed60cf8d8f46bc5865569f6de15809812d4435b204f6c4d8d7662512"

FILES_${PN} += "${datadir}/dbus-1"
