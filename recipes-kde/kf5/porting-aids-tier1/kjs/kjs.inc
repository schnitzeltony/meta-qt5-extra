SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c8f2a9b67efd71289575432ed3956b15"
SRC_URI[sha256sum] = "96fa57a4d81c18c41c79363e23560ebb8937c14d6ef0e57a082e06ebc1af4f6f"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"
