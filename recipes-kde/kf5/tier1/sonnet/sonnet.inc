SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5004a99d89fa8cc37d8f066a66bd467a"
SRC_URI[sha256sum] = "d11f917327fbe31a1a9666c560b4c4b49e6b38a3d104afe97daefcb110d9529f"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
