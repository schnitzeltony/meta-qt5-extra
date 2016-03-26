SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fbba353023ee472a93c7335d26d681dd"
SRC_URI[sha256sum] = "0d2f39d4ef2f9c3f4b9a42b1adfb70e25fc912cb535a9798dc9aa49ad0cac4a1"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"
