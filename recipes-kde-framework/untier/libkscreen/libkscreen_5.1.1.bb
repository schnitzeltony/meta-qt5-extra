SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

KDE_BRANCH = "${@bb.utils.contains("DISTRO_FEATURES", "wayland", "sebas/wayland", "Plasma/5.1",d)}"
SRCREV = "${@bb.utils.contains("DISTRO_FEATURES", "wayland", "7927dea10f9435cc39addfa9e7920c8ec0bc7d6e", "be5d2aed3cbfd7bef9741a8aa6f52a0eadb04b19",d)}"
inherit kde cmake-lib

SRC_URI += "file://0001-fix-configuration-build-on-x-less-systems.patch"

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "wayland", "kwayland", "qtx11extras", d)}"

FILES_${PN}-dbg += "${libdir}/plugins/kf5/kscreen/.debug"

CMAKE_HIDE_ERROR[1] = "KF5Screen, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "KF5Screen, -S${libdir}, -S${STAGING_LIBDIR}"

