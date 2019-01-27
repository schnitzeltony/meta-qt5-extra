SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += "file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch"
SRCREV = "7046f5b23629b7cb74c55b09f7e96e6aed17d8db"
PV = "0.14.0"

FILES_${PN} += "${datadir}/icons"
