SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e08731092cd42d120e79b5df93eb2d36"
SRC_URI[sha256sum] = "82db51b59ffdb5b2e69bc5c6ea54521acbc49ee5601baaf4e43cba50d12b418c"
