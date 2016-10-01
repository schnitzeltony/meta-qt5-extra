SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet libgit2"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3c44e3cdd5aeb599ebdcdf6d97c50489"
SRC_URI[sha256sum] = "648ff87ac206f0f6dbe191977f834ba0e3b21b433e6d963d943a3c38dbda0461"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
