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

SRCREV = "ea46656e33fd7b37cd1434ce657928c104d2d362"
PV = "2.8.0"

FILES:${PN} += " \
    ${datadir}/icons \
    ${datadir}/metainfo/org.lxqt.Qps.appdata.xml \
"
