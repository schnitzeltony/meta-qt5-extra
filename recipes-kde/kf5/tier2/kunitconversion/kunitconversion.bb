SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dc840b7be1e9c8e4ba715b3fee264714"
SRC_URI[sha256sum] = "5716474c4d031d9b5fdb3fe460957d4ceecd1d9c4e441df81a42bfbb993232fa"
