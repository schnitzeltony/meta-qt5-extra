DESCRIPTION = "Wallpapers for the Hawaii desktop environment"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit cmake allarch

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=dev"
SRCREV = "8592d4cbca4932c0b408f1135530d4d98f223333"
PV = "0.2.1+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}"
