SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += " \
    file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch \
"
SRCREV = "32749a56c90134b7e52df19825f834ad93f36a1f"
PV = "0.9.0+git${SRCPV}"

FILES_${PN} += "${datadir}/icons"
