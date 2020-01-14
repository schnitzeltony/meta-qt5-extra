SUMMARY = "Cross-platform media player"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri mime-xdg

DEPENDS += " \
    qtquickcontrols2 \
    qtmultimedia \
    vlc \
"

SRCREV = "04d239f4504daa1ea161d27dab23f6b1b5238f9d"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

FILES_${PN} += "${datadir}/metainfo"
