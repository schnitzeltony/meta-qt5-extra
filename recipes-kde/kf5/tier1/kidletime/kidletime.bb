SUMMARY = "Monitoring user activity"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "544c074d621f047ab42f91cc5ef1972d"
SRC_URI[sha256sum] = "8c42545c0d89fdbf034054afb7b8ea87d85be3fd1d690b16dd66bdcf7aa39312"

SRC_URI += "file://0001-Do-not-search-for-Qt5X11Extras-in-x-less-environment.patch"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/*/*/.debug"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5IdleTime, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5IdleTime, -S${includedir}, -S${STAGING_INCDIR}"
