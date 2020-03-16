SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "60f10f93001d9bf2ffca2eca62f0d19a"
SRC_URI[sha256sum] = "39ec06e2439306ce5b5efe5fe972d201e8c8e5fda634652cdc01c58427574adb"
