SUMMARY = "Qt port of obconf, the Openbox configuration tool"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit lxqt pkgconfig

DEPENDS += "qtx11extras openbox"

SRC_URI += " \
    file://0001-src-CMakeLists.txt-do-not-completely-overwrite-CMAKE.patch \
    file://0002-finding-sed-does-not-work-and-is-not-neccessary.patch \
"
SRCREV = "1ce85f193385adba843d9257639442578db4170e"
PV = "0.9.0+git${SRCPV}"

FILES_${PN} += "${datadir}/icons"
