SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "1bc1f0f4b612bf870947760ddea7c158"
SRC_URI[sha256sum] = "aa186e5751287701daec4d036aba776a911e4b84ca7eea44dc5fb531875afd94"

SRC_URI += " \
    file://0001-fix-configuration-build-on-x-less-systems.patch \
"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
