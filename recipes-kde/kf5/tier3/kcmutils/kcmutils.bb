SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cb3326fe23c757af9588f97f44882d71"
SRC_URI[sha256sum] = "2eec73ffca93eb5fc9975a96e072c565a4907b05c161f49877684f4ab252fd9d"

FILES_${PN} += "${datadir}/kservicetypes5"
