SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "349a11564686f99666071b2327910f61"
SRC_URI[sha256sum] = "844b5af639f7bf0c1b34bf5e1e2c2606ace89c516d99a5728085cdcaaf4c97f7"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"
