SUMMARY = "Support for spellchecking"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "320d964229aa783ac1a30670e6a930fe"
SRC_URI[sha256sum] = "7aa7342dddc351ee7c46a874498cb89fd96679a5b095d9f16cbe9c9511ccfd19"
SRC_URI += "file://0002-make-build-of-hunspell-optional.patch"
