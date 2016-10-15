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
SRC_URI[md5sum] = "1539faecf84cdfc12ce89ec1233031b3"
SRC_URI[sha256sum] = "84edcebe39f39a0a8e0080b7e6999bff30a90fd2796fbb71f3a9cbb713b1f7dd"

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
