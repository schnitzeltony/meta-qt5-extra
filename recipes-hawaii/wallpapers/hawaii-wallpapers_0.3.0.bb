SUMMARY = "Wallpapers for the Hawaii desktop environment"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit cmake allarch

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git;protocol=git;branch=master"
SRCREV = "f82be64dbf54c3d462adafa952ab6d28b28e7ad6"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}"
