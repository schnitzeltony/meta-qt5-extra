SUMMARY = "Image format plugins for Qt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    karchive \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "6d321eca3bcc3e182ef4237314fe5579"
SRC_URI[sha256sum] = "bd613186bd5e8236e9f87e0d7a487991f4ae2da038ec1ea3f0945ff13623b83c"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${datadir}/kservices5 \
"
