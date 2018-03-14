SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "42c15c5d3f3f355b374caf5ec20c9539"
SRC_URI[sha256sum] = "b4758c0ab13eec9b19247db06ee00f6c4e2228a838044cc78337655f79a827ff"
