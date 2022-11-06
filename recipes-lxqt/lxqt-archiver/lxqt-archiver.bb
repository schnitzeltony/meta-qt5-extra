SUMMARY = "A simple & lightweight desktop-agnostic Qt file archiver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt qt5-translation features_check mime-xdg gtk-icon-cache


DEPENDS += " \
    qtx11extras \
    json-glib \
    libfm-qt \
"

SRCREV = "3e4480f3684e393efe5207276447d19fb6e753a3"
PV = "0.7.0"

FILES:${PN} += "${datadir}/icons"
