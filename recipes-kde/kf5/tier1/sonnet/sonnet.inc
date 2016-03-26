SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3e545a92255a92c6899fc8a8f2aa3439"
SRC_URI[sha256sum] = "4308e18342d1823c0d039fad5f7c0febbf69d12cdd8fdd7e1d906f7639b79a1e"
SRC_URI += "file://0003-make-build-of-hunspell-optional.patch"
