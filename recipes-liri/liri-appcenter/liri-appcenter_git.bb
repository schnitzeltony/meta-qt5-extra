SUMMARY = "Software store"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=7702f203b58979ebbc31bfaeb44f219c \
"

inherit liri

REQUIRED_DISTRO_FEATURES = "flatpak"

PV = "0.1.0+git${SRCPV}"

SRCREV = "1611f5ba49dc1e15e3b4f6668934f2d8192b5eee"
S = "${WORKDIR}/git"

DEPENDS += " \
    flatpak \
    karchive \
    vibe \
"

FILES:${PN} += "${OE_QMAKE_PATH_QML} ${datadir}"
