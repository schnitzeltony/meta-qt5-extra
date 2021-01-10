SUMMARY = "A simple & lightweight desktop-agnostic Qt file archiver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt qt5-translation features_check mime-xdg gtk-icon-cache


DEPENDS += " \
    qtx11extras \
    json-glib \
    libfm-qt \
"

SRCREV = "b3a60a87eb1381411920f674a95d7c57f6256df3"
PV = "0.3.0"

FILES_${PN} += "${datadir}/icons"
