SUMMARY = "Software store"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=7702f203b58979ebbc31bfaeb44f219c \
"

inherit liri

REQUIRED_DISTRO_FEATURES = "flatpak"

PV = "0.1.0+git${SRCPV}"

SRCREV = "7eef3bfea5757a38bc8e98b576f489d0a80c3d6e"
S = "${WORKDIR}/git"

DEPENDS += " \
    flatpak \
    karchive \
    vibe \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML} ${datadir}"
