SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e98954ffcadcc3f32cf528fd8358e9eb"
SRC_URI[sha256sum] = "99fd42d919d3350e22ae99fc480a14bc30ebd461b064ef24aed5042c772a91c4"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
