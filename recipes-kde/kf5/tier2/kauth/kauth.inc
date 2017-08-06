SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2b86a68ac78057345a9727f0adf43d24"
SRC_URI[sha256sum] = "d3f94113d14f85894f59f234efebfec8c42b4b8a8452460b7f4f2ccc03657d28"

SRC_URI += " \
	file://0001-Make-autotests-optional.patch \
"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
