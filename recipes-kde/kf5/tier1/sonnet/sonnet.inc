SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2b6d47648a14410eb236d5fe2923600d"
SRC_URI[sha256sum] = "d4f7a0550b2647cdfa5693d06c23885d45440cdbb8131b785990c7b0dcf95d94"
SRC_URI += "file://0003-make-build-of-hunspell-optional.patch"
