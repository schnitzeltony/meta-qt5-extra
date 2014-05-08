DESCRIPTION = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit cmake

SRC_URI = " \
	git://anongit.kde.org/extra-cmake-modules;protocol=git \
"
SRCREV = "dea1b8759f37d1462236ddd43ee9dfb47670817a"
PV = "0.0.13+git${SRCPV}"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"

FILES_${PN} += "${datadir}/ECM"
