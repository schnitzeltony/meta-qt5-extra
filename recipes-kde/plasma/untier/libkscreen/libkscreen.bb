SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7e7ed3aba18f63a2514b69c402bb4b62"
SRC_URI[sha256sum] = "28f94f84570a5e3d57b4620c12c640622c2ee757c198e310c64e0b1dc68f66e5"

SRC_URI += "file://0001-fix-configuration-build-on-x-less-systems.patch"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
