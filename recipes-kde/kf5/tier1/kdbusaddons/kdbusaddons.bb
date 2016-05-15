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
SRC_URI[md5sum] = "9af16aecb66a00e251cce778101dfb51"
SRC_URI[sha256sum] = "b3053724f204032f13a3da1f491a745df26af8bed4e7e766c922e212cbba3a71"

CMAKE_ALIGN_SYSROOT[1] = "KF5DBusAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5DBusAddons, -S${includedir}, -S${STAGING_INCDIR}"

