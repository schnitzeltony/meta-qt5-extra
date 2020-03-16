SUMMARY = "Support for JS scripting in applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids perlnative

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7211eed3b6459163a9a9946e831f3364"
SRC_URI[sha256sum] = "18e3d7c667aec21e9e4d0d4730ad32a10475b7db5a574a674a8b90a6f9e0cd0e"
SRC_URI += "file://0001-create_hash_table-avoid-polution-of-files-with-build.patch"

DEPENDS += " \
    kdoctools \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
