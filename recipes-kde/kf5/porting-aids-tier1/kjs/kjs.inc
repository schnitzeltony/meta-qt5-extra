SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "85aa01de9c2775564c895d3efbcfb8cc68da9a84f511176fef16742cbbf90942"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools-native \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
