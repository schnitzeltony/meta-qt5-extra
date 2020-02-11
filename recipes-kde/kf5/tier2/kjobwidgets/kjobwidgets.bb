SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kcoreaddons-native kwidgetsaddons \
            ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3a8533dcb22764c9f80eb9957d530170"
SRC_URI[sha256sum] = "c74d291dfeb5b4e1a0002e76a2761bfdc379354ccd1937670c77418c06906e7f"

FILES_${PN} += "${datadir}/dbus-1"
