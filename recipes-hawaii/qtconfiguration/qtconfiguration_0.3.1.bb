SUMMARY = "Modules for fluid and dynamic applications development with QtQuick"
LICENSE = "BSD & GFDL-1.3 & GPLv3 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.BSD;md5=5bd3079664b3473c826ea30fd8d55687 \
	file://LICENSE.FDL;md5=3801d7932fdc07fd9efe89f9854a6caa \
	file://LICENSE.GPL;md5=d32239bcb673463ab874e80d47fae504 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii cmake_lib

DEPENDS += "dconf"

SRC_URI = " \
    git://github.com/hawaii-desktop/${BPN}.git \
"
SRCREV = "fd37e4f7a19b593e44f35e59a5a19aecc4f268a9"

S = "${WORKDIR}/git"

CMAKE_ALIGN_SYSROOT[1] = "QtConfiguration, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"

FILES_${PN} += "${libdir}/hawaii/qml/Hawaii/Configuration"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/Hawaii/Configuration/.debug"
FILES_${PN}-dev += "${libdir}/cmake"


