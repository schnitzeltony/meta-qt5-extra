SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fea1f5fb2cc65d440869b36d1a656409"
SRC_URI[sha256sum] = "e3b91b6cc70aa683027daf17c6e5e4c4e314c40f594e76026e0be10400e249aa"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"
