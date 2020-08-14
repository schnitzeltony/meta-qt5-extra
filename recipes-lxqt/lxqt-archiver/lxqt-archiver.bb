SUMMARY = "A simple & lightweight desktop-agnostic Qt file archiver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt features_check mime-xdg gtk-icon-cache


DEPENDS += " \
    qtx11extras \
    json-glib \
    libfm-qt \

SRC_URI += "file://0001-fix-compilation-error.patch"

SRCREV = "b6d1ac2cd834edefdb8a754d114da2a89b9323fa"
PV = "0.2.0"

FILES_${PN} += "${datadir}/icons"
