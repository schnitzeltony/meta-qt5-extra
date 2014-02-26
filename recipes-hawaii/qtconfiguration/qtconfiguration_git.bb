DESCRIPTION = "Modules for fluid and dynamic applications development with QtQuick"
LICENSE = "BSD GFDL-1.3 GPLv3 LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.BSD;md5=5bd3079664b3473c826ea30fd8d55687 \
	file://LICENSE.FDL;md5=3801d7932fdc07fd9efe89f9854a6caa \
	file://LICENSE.GPL;md5=d32239bcb673463ab874e80d47fae504 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit cmake_qt5 pkgconfig

DEPENDS = "qtbase dconf"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "abe92ec0d4c51be2c07690c50030b9eba8081da6"
PV = "0.2.1+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN}-dev += "${libdir}/cmake"
