SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "428f94a21061feca57feff45af819d33"
SRC_URI[sha256sum] = "bb96f44e6156a793f290c24767e7d7ab9f29d1305a3e541e2f1f4614cf3d370f"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"
