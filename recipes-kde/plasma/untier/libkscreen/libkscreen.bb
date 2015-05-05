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
SRC_URI[md5sum] = "13475823e0a69ec263b284e1fd65b0c3"
SRC_URI[sha256sum] = "4dd23d72d0fa54cfaa23d62c93ab0a01ad75c4d7023895b23a47c450e890afc1"

SRC_URI += " \
    file://0001-fix-configuration-build-on-x-less-systems.patch \
"


FILES_${PN} += " \
    ${libdir}/${QT_DIR_NAME}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/${QT_DIR_NAME}/plugins/kf5/kscreen/.debug \
    ${libexecdir}/kf5/.debug \
"

CMAKE_ALIGN_SYSROOT[1] = "KF5Screen, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "KF5Screen, -S${libdir}, -S${STAGING_LIBDIR}"

