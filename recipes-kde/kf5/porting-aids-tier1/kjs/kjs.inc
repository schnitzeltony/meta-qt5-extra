SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "40f11254a4c67d679fbda594bf0c5029bf88d555bdb7d31bf4807a28df085e4b"
SRC_URI += " \
    file://0001-create_hash_table-avoid-polution-of-files-with-build.patch \
    file://0002-create_hash_table-Log-basename-only-to-make-QA-happy.patch \
"

DEPENDS += " \
    kdoctools-native \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
