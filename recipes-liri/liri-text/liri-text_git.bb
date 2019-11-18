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

PV = "0.5.0+git${SRCPV}"

SRCREV = "53a995fae34e5bfd67182cd44f66a50fa81d5d4a"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/metainfo \
    ${datadir}/liri-text/language-specs \
"
