SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5b055d6eba258d03064cb7bbf247523c"
SRC_URI[sha256sum] = "bc9a62d24f6bdd0e8830481f915744cf640660c99ecb54cbeea73de5b218a20b"
