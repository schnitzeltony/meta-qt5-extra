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
SRC_URI[md5sum] = "9b1f53a1827a22e4e09da26ea88e5b16"
SRC_URI[sha256sum] = "8508b1b67f883a6e4fd29f2cb2781f434a16a30b594609b388efc6eb905de4be"

do_configure_append() {
    # adjust path to protocol sources in sysroot
    # once there are more consumers of plasma-wayland-protocols we might need
    # to find another solution
    sed -i 's: ${datadir}/plasma-wayland-protocols: ${STAGING_DATADIR}/plasma-wayland-protocols:g' ${B}/build.ninja
}
