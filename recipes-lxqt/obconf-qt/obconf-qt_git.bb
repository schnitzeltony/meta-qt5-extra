SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += "file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch"
SRCREV = "2d67ed426a1fde62e1300b2e1e4db8724ca51d6c"
PV = "0.14.1"

FILES_${PN} += "${datadir}/icons"
