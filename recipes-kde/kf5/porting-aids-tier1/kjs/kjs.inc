SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2d3a4679fe09493144e06abb3b77631d"
SRC_URI[sha256sum] = "143bfd56304661d94fe815320000cc1dbd37456be5ea9a54d34b65329b8cdf70"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"
