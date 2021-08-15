SUMMARY = "The Qt process manager"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation pkgconfig  gtk-icon-cache

DEPENDS += " \
    libxrender \
    qtx11extras \
    qttools \
    lxqt-config \
"

SRCREV = "c3c94face4f94df0242ed18a7a68056ff7e17d94"
PV = "2.3.0"

FILES:${PN} += " \
    ${datadir}/icons \
"
