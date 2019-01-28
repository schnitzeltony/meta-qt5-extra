SUMMARY = "The Qt process manager"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt pkgconfig  gtk-icon-cache

DEPENDS += "qtx11extras qttools"

SRCREV = "9969f909ede5e26c1a3c8800cc584ea065dbd1c4"
PV = "1.10.19"

FILES_${PN} += " \
    ${datadir}/icons \
"
