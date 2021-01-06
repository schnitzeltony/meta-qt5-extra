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
SRC_URI[sha256sum] = "e0f36407ba32721936b0b14894480279f60effc088e4e1f3cde6e5c584945d2a"

do_configure_append() {
    # adjust path to protocol sources in sysroot
    # once there are more consumers of plasma-wayland-protocols we might need
    # to find another solution
    sed -i 's: ${datadir}/plasma-wayland-protocols: ${STAGING_DATADIR}/plasma-wayland-protocols:g' ${B}/build.ninja
    sed -i 's: ${datadir}/wayland/wayland.xml: ${STAGING_DATADIR}/wayland/wayland.xml:g' ${B}/build.ninja
}
