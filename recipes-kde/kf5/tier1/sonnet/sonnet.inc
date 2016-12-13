SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "be646b39a16a2b848540715f6407f377"
SRC_URI[sha256sum] = "20358de0d45387f44260c3e6f8df012d661b4446293cbb3823c978e3a8766965"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
