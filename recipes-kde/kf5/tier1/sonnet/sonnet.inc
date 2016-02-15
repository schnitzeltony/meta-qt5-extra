SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "08106da14942ebdfe0b901e649c20d7c"
SRC_URI[sha256sum] = "a70ff0a2d4212af9a5db9d5dc0a12c5cf4e23c5b000896820d387a0ee0b3310b"
SRC_URI += "file://0003-make-build-of-hunspell-optional.patch"
