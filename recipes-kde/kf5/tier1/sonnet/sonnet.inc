SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9e93fb9e6072fdb8738d8618e1cbcd4f"
SRC_URI[sha256sum] = "4d8f6baf9b4c44bec3e61e3d64a70a522c2f7ab2965a72e85ebef45c925bde24"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
