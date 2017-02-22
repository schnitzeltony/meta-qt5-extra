SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0f7be81fe9c68044f20d6c297a624558"
SRC_URI[sha256sum] = "dda99b4ace22088e2717d42057434ee57fd20cb9a65589b9788c9dbdc6160da4"
