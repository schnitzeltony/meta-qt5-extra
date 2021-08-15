SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += "file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch"
SRCREV = "e2eb2f152f95ffd858d998f3432a2baff18f272f"
PV = "0.16.1"

FILES:${PN} += "${datadir}/icons"
