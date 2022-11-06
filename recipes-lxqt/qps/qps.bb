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

SRCREV = "6e83a692e319bc282f7b305458173b0cef539ba7"
PV = "2.6.0"

FILES:${PN} += " \
    ${datadir}/icons \
"
