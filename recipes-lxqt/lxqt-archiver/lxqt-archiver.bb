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

SRCREV = "fdbba576e58108f5c03892978ab563b8859ca254"
PV = "0.4.0"

FILES:${PN} += "${datadir}/icons"
