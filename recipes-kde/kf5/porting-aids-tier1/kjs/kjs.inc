SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "f93e14a2deb978ccb8e7b0e7e6a2e4c3a23fe9ffe5a64d569c824302d93b3c1b"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools-native \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
