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

SRCREV = "53208fb3b3c325cc2be6ff4989cd59c142db7f15"
PV = "0.6.0"

FILES:${PN} += "${datadir}/icons"
