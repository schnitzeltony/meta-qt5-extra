SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e638937c2b21b122829266107fd5ec3e"
SRC_URI[sha256sum] = "981ddb22493e2a0eb0ca17a9cc4a8c251c992c29ee56652081f9bb8fce1b752b"
