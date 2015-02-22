SUMMARY = "File manager and desktop icon manager (Qt port of PCManFM and libfm)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras glib-2.0 libxcb libfm menu-cache"

SRCREV = "d73a7b33a693b769e0bcb026192cc87965778aa4"
PV = "0.9.0"

FILES_${PN}-translations = " \
    ${datadir}/libfm-qt/translations \
    ${datadir}/pcmanfm-qt/translations \
"
