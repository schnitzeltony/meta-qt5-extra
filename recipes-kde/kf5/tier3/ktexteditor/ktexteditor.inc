SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "35155f9676bbf1363660af3d84d262ed"
SRC_URI[sha256sum] = "63fc3e02def2b75eb55e191985ca563a4309036b72543c8eac07c1c4e8e49a42"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
