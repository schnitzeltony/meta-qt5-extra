SUMMARY = "Wallpapers for the Hawaii desktop environment"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

inherit hawaii

SRCREV = "ffca94dc6917ba0109dbd837cc3579fd0cde6357"
PV = "0.4.90+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}"
