SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2c5c660aea6c55c3f21f29cc3f1df604"
SRC_URI[sha256sum] = "3f3dab1f0d84972d50a7cd97f9641018954014605cff2f6240ffb86331d47fe4"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
