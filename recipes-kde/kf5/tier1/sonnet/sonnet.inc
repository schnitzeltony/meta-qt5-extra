SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9fe51016d7879cb8fac5fe374491a561"
SRC_URI[sha256sum] = "c83791acc41250d05d19471472bb9a862414a30721142df0b4d28810f71cf6ef"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
