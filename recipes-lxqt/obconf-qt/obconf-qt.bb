SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += "file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch"
SRCREV = "b8d486b8be0e66570a80489c3e9084ce143ffa42"
PV = "0.16.2"

FILES:${PN} += "${datadir}/icons"
