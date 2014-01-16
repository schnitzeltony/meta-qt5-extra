DESCRIPTION = "Wallpapers for the Hawaii desktop environment"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit cmake

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=stable"
SRCREV = "819adbac15521775d4cee4251f98f85beef7c651"
PV = "0.2.1+git${SRCPV}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "all"

FILES_${PN} += "${datadir}/backgrounds"
