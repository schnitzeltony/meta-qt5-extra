SUMMARY = "Support for icon themes"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtsvg ki18n kconfig kconfigwidgets kwidgetsaddons kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d3053afcfd358e13bec0d055695727e7"
SRC_URI[sha256sum] = "e969d2180f0d5b0802e7c57d63ff78314562cad4b50dbb3a0935d5edc4c33d6a"
