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
SRC_URI[md5sum] = "71109ffe31aa72fb8afbc56215e9c8d1"
SRC_URI[sha256sum] = "b1cb1c47c7d726c55b6a50fbd111095a3b5dc8426be5f8aefaa3efcb0ab000ab"

CMAKE_HIDE_ERROR[1] = "KF5DBusAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5DBusAddons, -S${includedir}, -S${STAGING_INCDIR}"

