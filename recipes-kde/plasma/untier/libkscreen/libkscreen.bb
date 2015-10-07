SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma cmake-lib

DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "wayland", "kwayland", "", d)} \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "5b3c52fbf0172dfcf749cde12ebb48f3"
SRC_URI[sha256sum] = "da2311e9cd4aac24f6545372b6084ed7d80b4e1adfd36836999fba7ea4105f5c"

SRC_URI += " \
    file://0001-fix-configuration-build-on-x-less-systems.patch \
"


FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/kscreen/.debug \
    ${libexecdir}/kf5/.debug \
"

CMAKE_ALIGN_SYSROOT[1] = "KF5Screen, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5Screen, -S${libdir}, -S${STAGING_LIBDIR}"

