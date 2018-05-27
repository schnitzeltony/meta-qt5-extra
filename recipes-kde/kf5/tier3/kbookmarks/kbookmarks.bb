SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kconfigwidgets kconfig kiconthemes kxmlgui kconfig-native kcoreaddons-native \
            kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1c5c1ca0f47540e0306fe0b861f04cf7"
SRC_URI[sha256sum] = "b41f45029a930a9e8b459497c17ffcb9be7bb5b79653bfd072c74d9d0bd7edc4"
