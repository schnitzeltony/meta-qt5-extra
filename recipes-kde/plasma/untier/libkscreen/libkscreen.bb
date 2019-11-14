SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "131d445c156a425e4fd16a2c6e16e8f2"
SRC_URI[sha256sum] = "14f29c3ae4c57f4e312c51716825bf342714ccb428ee425266d2521b17276ffa"

SRC_URI += " \
    file://0001-fix-configuration-build-on-x-less-systems.patch \
"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
