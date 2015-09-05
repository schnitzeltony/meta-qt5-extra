SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f28699a6421aa478b98e76f6dbe6683a"
SRC_URI[sha256sum] = "28178afd677838339ac86afd8887cb0a5d8a0ded77d0438b7c118639c07043c6"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"
