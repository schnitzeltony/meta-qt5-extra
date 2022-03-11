SUMMARY = "Cross-platform media player"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri mime-xdg gtk-icon-cache

DEPENDS += " \
    qtquickcontrols2 \
    qtmultimedia \
    vlc \
"

SRCREV = "3968ec527d2f3dce60260fb0449ba187b11e7985"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

FILES:${PN} += "${datadir}/metainfo"
