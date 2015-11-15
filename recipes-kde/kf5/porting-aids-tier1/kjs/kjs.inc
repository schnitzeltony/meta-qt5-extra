SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f75e43065bb3df006e328005c60f08e6"
SRC_URI[sha256sum] = "5b4f39e626d2924e64a2a4babcfab050db0e22540b91afe9f78595ce53bf457e"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"
