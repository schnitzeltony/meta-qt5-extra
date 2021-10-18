SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "e879d3f1df4facb42abc87c0fa5a8958d4ea63962d2ff19caf56cc319f841cc6"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools-native \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
