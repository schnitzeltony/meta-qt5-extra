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

SRCREV = "efb4c2932fb6724b0d0762080e1e812be3127e02"
PV = "2.5.0"

FILES:${PN} += " \
    ${datadir}/icons \
"
