SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "edbdaa821afa328331e46e3d959924ca"
SRC_URI[sha256sum] = "4ecd09af1df430110da6607fabb0aa5231f89b3cff0b1477438c899d5d4204d8"

FILES_${PN} += "${datadir}/dbus-1"
