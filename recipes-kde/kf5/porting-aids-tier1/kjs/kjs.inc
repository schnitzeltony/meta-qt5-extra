SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "3ba71d88c9617cb18a3e989647cc1aa6"
SRC_URI[sha256sum] = "c6929aa120384c1de8024d8a5a5462ad1604295171761840f36342a9e4e9ff1a"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"
