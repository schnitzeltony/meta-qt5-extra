SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "81301f7660abc2ff4cdffe85736249ec"
SRC_URI[sha256sum] = "37ab39659cec1ea141d244b3c59678f19d1609299e0c084e2d6a4dc49255fa9b"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
