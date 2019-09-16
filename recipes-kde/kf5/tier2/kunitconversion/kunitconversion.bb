SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1df3f35231df1ec2f69073179bdbe899"
SRC_URI[sha256sum] = "e96ce3efcb6efe3afc0d5cf093971ea89fe2f20660da16349309cf6748446f41"
