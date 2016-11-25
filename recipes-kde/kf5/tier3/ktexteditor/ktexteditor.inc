SUMMARY = "Advanced embeddable text editor"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 perlnative

DEPENDS += "karchive kconfig kguiaddons ki18n kio kparts sonnet libgit2"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7d524ba30f518a0937c3912475a59a13"
SRC_URI[sha256sum] = "d8a1f53a2bd14101d95e9d8db6faabda88450a9b571947e0bd0f2eadba2881ea"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
