SUMMARY = "Material Design text editor"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=7702f203b58979ebbc31bfaeb44f219c \
"

inherit liri qt5-translation gtk-icon-cache mime-xdg

DEPENDS += " \
    qtquickcontrols2 \
    liri-fluid \
    sqlite3 \
"

PV = "0.5.0+git${SRCPV}"

SRCREV = "c93d7d67815b6a599d1b62499b4fb82566ecae7a"
S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${datadir}/icons \
    ${datadir}/metainfo \
    ${datadir}/liri-text/language-specs \
"
