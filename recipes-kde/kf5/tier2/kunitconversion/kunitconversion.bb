SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c53b9c65b204135d7df8235b1e27126b"
SRC_URI[sha256sum] = "834cac72b5b186109076bda19bec3be6faa2ae68669336ac2e67b45f0602ab91"
