SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7c88ae56084c5b43538344af72b4b6d2"
SRC_URI[sha256sum] = "9e95cb54f4323f31f88e3fb5946b4f990d8a5f1ba8fecf166844af672037a60c"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
