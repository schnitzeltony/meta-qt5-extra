SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)}"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "de370e40b2d327a8a9894a3b38caacd8"
SRC_URI[sha256sum] = "51a55c4c490838efa9cf369aa6050f76df7827ba9ebde0d69360b86f99afee93"

SRC_URI += " \
    file://0001-fix-configuration-build-on-x-less-systems.patch \
"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/kscreen/.debug \
    ${libexecdir}/kf5/.debug \
"
