SUMMARY = "Common files for LXQt"
LICENSE = "CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=9;endline=9;md5=1468be559d088410c64a6db10364f77c"

inherit lxqt gtk-icon-cache

DEPENDS += "liblxqt"

SRC_URI += " \
    file://0001-startlxqt-enable-starting-from-console.patch \
    file://0002-slightly-change-theme-defaults.patch \
"
SRCREV = "e6e6a97d01482497d4fd45c68e1eee0aaed458a4"
PV = "0.11.2"

FILES_${PN} += " \
    ${datadir}/kdm \
    ${datadir}/xsessions \
    ${datadir}/desktop-directories \
    ${datadir}/lxqt \
"

RDEPENDS_${PN} += "xinit"
RRECOMMENDS_${PN} += "oxygen qtsvg-plugins"
