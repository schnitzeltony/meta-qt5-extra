SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "84eaf54cdb480a108257772a77296514"
SRC_URI[sha256sum] = "8ff82d14fe0dd92ac774d5cd9cd6334b01574f0f5c584266f97359dde5db9a5f"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
