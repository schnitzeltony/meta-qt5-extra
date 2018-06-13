SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5af7cdc4b7a4e3ee5209cfa0a324172f"
SRC_URI[sha256sum] = "adc88986ae776a8fb21d06ea67212c6fa1becc34d94ee4c7ad9d85d26494fa62"

FILES_${PN} += "${datadir}/kservicetypes5"
