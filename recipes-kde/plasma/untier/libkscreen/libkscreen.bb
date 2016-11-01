SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma

DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "e067b3647ae57f578cbeb22a5f1bac24"
SRC_URI[sha256sum] = "a76f976494ac98b742969830c350b89b354b11a854c1d884dbe0daecc79c4a26"

SRC_URI += " \
    file://0001-fix-configuration-build-on-x-less-systems.patch \
    file://0002-avoid-autotests.patch \
"


FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/kscreen/.debug \
    ${libexecdir}/kf5/.debug \
"
