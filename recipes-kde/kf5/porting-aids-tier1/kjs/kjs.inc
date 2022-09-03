SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "0e59e1d757819943d76e1df8af3f2cbf586b0104aafa8ee7b8b4ea82987bdcf8"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools-native \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
