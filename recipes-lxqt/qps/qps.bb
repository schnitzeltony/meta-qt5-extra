SUMMARY = "The Qt process manager"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt pkgconfig  gtk-icon-cache

DEPENDS += " \
    libxrender \
    qtx11extras \
    qttools \
    lxqt-config \
"

SRCREV = "aa00c771c36a08cb93140c73cb790a73b6401fb5"
PV = "2.1.0"

FILES_${PN} += " \
    ${datadir}/icons \
"
