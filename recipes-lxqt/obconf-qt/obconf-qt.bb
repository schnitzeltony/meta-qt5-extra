SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += "file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch"
SRCREV = "28c488716e448a55720d6db5590bc1eec003f1f7"
PV = "0.16.0"

FILES_${PN} += "${datadir}/icons"
