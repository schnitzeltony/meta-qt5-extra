SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7ca5821dbb7073bba9caf26baa5b00eb"
SRC_URI[sha256sum] = "fb53e8d3c8997fbda4cf2b2a2e6ce71eecd44683903e039d35256ec3ac582113"
