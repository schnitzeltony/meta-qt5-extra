SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2f0a96ed8ba6c9534bb5764a91350bd2"
SRC_URI[sha256sum] = "306ea881ad235b7e1360dd5842ac9da312d1a0d15e16214db3a8af1d30b0077a"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"
