SUMMARY = "KDE's screen management software"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "21393c76b1646303d4b550538e9b3b7b044e9c1a605cfabde780e931bbe4a70d"
SRC_URI += "file://0001-fix-configuration-build-on-x-less-systems.patch"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
