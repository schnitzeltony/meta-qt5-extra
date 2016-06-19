SUMMARY = "Addons to QtDBus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0805d1dee82cf6d627dbdf2872bbbb00"
SRC_URI[sha256sum] = "c65fdab67401609835ad6523789d0f9cac50f784ecf915bd897386ce214f75ae"

CMAKE_ALIGN_SYSROOT[1] = "KF5DBusAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DBusAddons, -S${includedir}, -S${STAGING_INCDIR}"

