SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "06e49a720e9d8f7e79142638a978580a"
SRC_URI[sha256sum] = "accf0724615abf684258fa087e4166e803385ec4190f92c792fd16e8189366ed"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
