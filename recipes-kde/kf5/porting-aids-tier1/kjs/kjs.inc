SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dbe8d5a37f7f758f36d576b4d8a94126"
SRC_URI[sha256sum] = "57c16396c4d0cbf15cc682ab03c7baf96b6875875ab6cda9405a5084a2df6eab"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"
