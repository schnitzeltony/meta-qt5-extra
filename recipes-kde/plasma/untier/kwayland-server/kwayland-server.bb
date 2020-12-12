SUMMARY = "Wayland Server Components built on KDE Frameworks"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma

DEPENDS += " \
    qtwayland-native \
    plasma-wayland-protocols \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "3edc7b73baa6fa8b0bec51272e8786bab41998b0f675262d5086fdf6c1e9bb44"

do_configure_append() {
    # adjust path to protocol sources in sysroot
    # once there are more consumers of plasma-wayland-protocols we might need
    # to find another solution
    sed -i 's: ${datadir}/plasma-wayland-protocols: ${STAGING_DATADIR}/plasma-wayland-protocols:g' ${B}/build.ninja
    sed -i 's: ${datadir}/wayland/wayland.xml: ${STAGING_DATADIR}/wayland/wayland.xml:g' ${B}/build.ninja
}
