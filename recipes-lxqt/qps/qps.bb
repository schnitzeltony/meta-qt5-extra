SUMMARY = "The Qt process manager"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation pkgconfig  gtk-icon-cache

DEPENDS += " \
    libxrender \
    qtx11extras \
    qttools \
    lxqt-config \
"

SRCREV = "d308c15f0eff4ba0025f49375bb03a075a631cc4"
PV = "2.4.0"

FILES:${PN} += " \
    ${datadir}/icons \
"
