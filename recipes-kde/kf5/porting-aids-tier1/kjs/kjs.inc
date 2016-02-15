SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c81cc309513c4c7f075e0e922a3bceff"
SRC_URI[sha256sum] = "4eb91a5337a9d35946a0b810991ddb8f0102d7197b3c2040dd452c28cc09a022"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"
