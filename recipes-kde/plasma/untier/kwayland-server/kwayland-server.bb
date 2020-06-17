SUMMARY = "Wayland Server Components built on KDE Frameworks"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma

DEPENDS += " \
    qtwayland-native \
    plasma-wayland-protocols \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0acc000ecd8dd73db80687a934751579"
SRC_URI[sha256sum] = "e39d41a3d96db6d08cf559b60d1290e905f31a9942cd595d17d84df95376ea67"

do_configure_append() {
    # adjust path to protocol sources in sysroot
    # once there are more consumers of plasma-wayland-protocols we might need
    # to find another solution
    sed -i 's: ${datadir}/plasma-wayland-protocols: ${STAGING_DATADIR}/plasma-wayland-protocols:g' ${B}/build.ninja
}
