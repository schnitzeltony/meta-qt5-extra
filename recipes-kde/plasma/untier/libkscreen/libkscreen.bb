SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

DEPENDS += "kwayland"

inherit kde-plasma cmake-lib

DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6d19479c61e5bb96424b78b7572fbf48"
SRC_URI[sha256sum] = "3e306f0d935f9e987125ca43f8e748ca61e72b327f6da35f07537614c5203b70"

SRC_URI += " \
    file://0001-make-kwayland-support-optional.patch \
    file://0002-fix-configuration-build-on-x-less-systems.patch \
    file://0003-avoid-autotests.patch \
"


FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/kscreen/.debug \
    ${libexecdir}/kf5/.debug \
"

CMAKE_ALIGN_SYSROOT[1] = "KF5Screen, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5Screen, -S${libdir}, -S${STAGING_LIBDIR}"

