SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1863877132650a61510ee37c894a43c5"
SRC_URI[sha256sum] = "c3be349e3802dfa73e0ad719f60adf454a42fee30a2c7cb7dc76073d71124f90"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
