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
SRC_URI[md5sum] = "104ea71b7a1495649a6c2b10ec76d49a"
SRC_URI[sha256sum] = "b30b54d9270f57a092f0707166e3822fdef5577f4a363eb4cd9f3af2cbaab8fa"

FILES_${PN} += "${datadir}/kservicetypes5"
