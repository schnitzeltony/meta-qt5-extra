SUMMARY = "Utilities for working with KCModules"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += "kitemviews kconfigwidgets kcoreaddons ki18n kiconthemes kservice kxmlgui \
            kdeclarative kcoreaddons-native kauth-native kconfig-native kpackage-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b6838a8882ac218eeed28ce34f604fcb"
SRC_URI[sha256sum] = "0b15971ece6003636d012e37760324b005b06050d4d076bbe30eed427717ce58"

FILES_${PN} += "${datadir}/kservicetypes5"
