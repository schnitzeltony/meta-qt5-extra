SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "d023a19fa6fbff1479cc9144eb1d8393"
SRC_URI[sha256sum] = "157f4d21e83a6e92e30894f472b65452ecd2183ac2e25e24f740e971befed383"
