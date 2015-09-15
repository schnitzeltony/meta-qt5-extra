SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += " \
    file://0001-finding-sed-does-not-work-and-is-not-neccessary.patch \
"
SRCREV = "9be460975407638ef8362f026a4097437d6a2538"
PV = "0.9.0+git${SRCPV}"

FILES_${PN} += "${datadir}/icons"
