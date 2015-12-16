SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "da071104f8507b04aebf201e006d234c"
SRC_URI[sha256sum] = "044a0a1faf037c4586e19da4d8ea141e56c05547ab8ad087a295301c1fc30825"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"
