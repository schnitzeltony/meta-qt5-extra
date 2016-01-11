SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "332bd1a8e3d131a5cd7774f3d1092bc3"
SRC_URI[sha256sum] = "c23439fe7373d5e1e153e7e0f67ee6bb573da901659bb67068740f0dbda0097d"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"
