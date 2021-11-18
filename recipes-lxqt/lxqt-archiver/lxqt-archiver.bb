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

SRCREV = "5475455e9fe96302b20e286a0410c09a32c57696"
PV = "0.5.0"

FILES:${PN} += "${datadir}/icons"
