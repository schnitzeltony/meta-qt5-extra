SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9424c658138501742a2af85495c47f60"
SRC_URI[sha256sum] = "e938bbb32d7fb69e6dd65772f82e1610e2c38e482db87b891bea6514c4c75686"
