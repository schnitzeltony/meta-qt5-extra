SUMMARY = "The Qt process manager"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt pkgconfig  gtk-icon-cache

DEPENDS += "libxrender qtx11extras qttools"

SRCREV = "f418b91afccffbed31744c1e23e220ad79985acf"
PV = "1.10.20"

FILES_${PN} += " \
    ${datadir}/icons \
"
