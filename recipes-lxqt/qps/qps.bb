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

SRCREV = "ef05564929240789258039ed4be98790682bcc2a"
PV = "2.2.0"

FILES_${PN} += " \
    ${datadir}/icons \
"
