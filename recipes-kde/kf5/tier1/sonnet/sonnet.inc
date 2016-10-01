SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4b73bd6c586f6cf036624ba8c8ae7775"
SRC_URI[sha256sum] = "e20f641628f561b8571874fc67441a0a7721026492d52c02f4cb82b956a67b2a"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
