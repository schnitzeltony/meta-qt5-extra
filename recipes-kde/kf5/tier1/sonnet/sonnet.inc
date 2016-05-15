SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "247fb35b1553c53c0b3c83564a39124c"
SRC_URI[sha256sum] = "8873decf23d78cf8d395e2b26823ea3dae810f528f0822e54e4515a35c1d1479"
SRC_URI += "file://0003-make-build-of-hunspell-optional.patch"
