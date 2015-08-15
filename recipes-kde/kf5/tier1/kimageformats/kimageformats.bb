SUMMARY = "Image format plugins for Qt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6fbf6f618f3e8287ab79d15e7bbbd683"
SRC_URI[sha256sum] = "9e9a529152200ee7b0b0328091aecec7be33a9affd8765394277f21925551953"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/kservices5 \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/.debug"
