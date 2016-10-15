SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "45bd0c4fe7f903980617bc818ee543e7"
SRC_URI[sha256sum] = "3bef88e61303e172fa6e3d824b01c371c44b81629cb67267717a27309e7d231e"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
