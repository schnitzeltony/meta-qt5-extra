SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a557695b926c0857a4aba81c43879242"
SRC_URI[sha256sum] = "b14c6299e7b668fe18ed3f5991648e2daec79044c272d9ed46053961194de251"
SRC_URI += "file://0003-make-build-of-hunspell-optional.patch"
