SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

SRCREV = "be1c7112d477acbcf16904c20d38ca1f15fdaf05"
inherit kde cmake-lib

SRC_URI += " \
    file://0001-fix-configuration-build-on-x-less-systems.patch \
"

DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "wayland", "kwayland", "", d)} \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/kf5/kscreen/.debug \
    ${libexecdir}/kf5/.debug \
"

CMAKE_HIDE_ERROR[1] = "KF5Screen, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "KF5Screen, -S${libdir}, -S${STAGING_LIBDIR}"

