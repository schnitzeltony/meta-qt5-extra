SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "940627dd8c2792676dd6f74b8c1130ab"
SRC_URI[sha256sum] = "a962319000324200ec1abe3c58b1b8ab71ed4cc7c88a3c7e03a1c8eca86c287c"

SRC_URI += "file://0001-fix-configuration-build-on-x-less-systems.patch"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
