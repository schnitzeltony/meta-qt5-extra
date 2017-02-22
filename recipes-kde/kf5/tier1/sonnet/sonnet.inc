SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "11cef5b5016def5298b64e2ce561a8b5"
SRC_URI[sha256sum] = "e3f73e408ee00ed290b051f5abc86789fb46f8664b8c919ddf858b752f6c7f9b"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
