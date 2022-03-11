SUMMARY = "Software store"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=7702f203b58979ebbc31bfaeb44f219c \
"

inherit liri

REQUIRED_DISTRO_FEATURES = "flatpak"

PV = "0.1.0+git${SRCPV}"

SRCREV = "925e600f5aa44dbec81e6dca9c6194f11bbdf715"
S = "${WORKDIR}/git"

DEPENDS += " \
    flatpak \
    karchive \
    vibe \
"

FILES:${PN} += "${OE_QMAKE_PATH_QML} ${datadir}"
