DESCRIPTION = "Icon themes for the Hawaii desktop environment"
LICENSE = "GPLv2 LGPLv2.1 CC-BY-SA-3.0"
LIC_FILES_CHKSUM = " \
	file://icons/elegant/COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
	file://icons/elegant-symbolic/COPYING;md5=89ba2c3e2cca67ff39fe5d2ba3fd1e61 \
	file://cursors/hawaii/COPYING;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit cmake

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=stable"
SRCREV = "c06a13d4adf43db979903219c04bc64cb9f81f6e"
PV = "0.2.0+git${SRCPV}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "all"

FILES_${PN} += "${datadir}/icons"

RDEPENDS_${PN} = "qtsvg"
