SUMMARY = "Advanced text editing widgets"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcompletion kconfig kconfigwidgets ki18n kiconthemes kservice kwidgetsaddons \
            kwindowsystem sonnet kconfig-native kcoreaddons-native kauth-native \
            gettext-native sonnet-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7f3a72982fc9ac89dbe1cf16802b7ec9"
SRC_URI[sha256sum] = "8149a999ca6d2dda523d6047956ca62fd283d71356b84dfd7db6fd1582b5d43e"

FILES_${PN} += "${datadir}/kservicetypes5"
