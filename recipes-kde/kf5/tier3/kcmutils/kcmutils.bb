SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6584d6b0b295f9fb8aacbe21d58620bd"
SRC_URI[sha256sum] = "0213655963d02b5e66918d242d71f08b9cde7c9040a95518437cdefa0959187d"

FILES_${PN} += "${datadir}/kservicetypes5"
