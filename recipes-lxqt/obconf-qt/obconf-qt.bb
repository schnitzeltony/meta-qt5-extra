SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += "file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch"
SRCREV = "1f42940f7a557bf20e772b7ac6c3e15a04013a95"
PV = "0.16.4"

FILES:${PN} += "${datadir}/icons"
