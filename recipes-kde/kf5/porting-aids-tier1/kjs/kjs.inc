SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "3286281f3ebbfc78336cff73a012106f836f39b7ef1ed32e6040c4ffb98f72ec"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
