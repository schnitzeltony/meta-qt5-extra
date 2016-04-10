SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5c8212774d88fb0038b39e742f1ea7fa"
SRC_URI[sha256sum] = "8df561b781229f685d8707e7c766155e47d216d81d5b0ab234ba5180f2410b21"
SRC_URI += "file://0003-make-build-of-hunspell-optional.patch"
