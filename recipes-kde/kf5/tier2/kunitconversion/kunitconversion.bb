SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4415594a96df39e9d5d0c47761cb7966"
SRC_URI[sha256sum] = "78daff1e168f1469f7d6102a25a5934c1cf8ea6f84550df0096c25b5058bd42d"
