SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3fd40a72390912440c06289b5a17faa8"
SRC_URI[sha256sum] = "ffa61de96a5b11d29b871cd9caf075995236ad3dd432738fb774c97197d9ee8b"

FILES_${PN} += "${datadir}/kservicetypes5"
