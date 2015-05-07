SUMMARY = "Wallpapers for the Hawaii desktop environment"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit hawaii

SRCREV = "8fd3af71230f0d4649b94e3afba5cfe0b25b0a8d"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}"
