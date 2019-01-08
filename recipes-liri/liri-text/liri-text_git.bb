SUMMARY = "Material Design text editor"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=7702f203b58979ebbc31bfaeb44f219c \
"

inherit liri gtk-icon-cache

DEPENDS += " \
    qtquickcontrols2 \
    liri-fluid \
    sqlite3 \
"

PV = "0.4.1+git${SRCPV}"

SRCREV = "bd3ad1463fc5f5893caf122c6ee068e3203b91dd"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/metainfo \
    ${datadir}/liri-text/language-specs \
"
