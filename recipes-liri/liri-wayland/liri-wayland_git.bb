SUMMARY = "Wayland client and server extensions"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

DEPENDS += " \
    wayland-protocols \
"

SRCREV = "3ec6248bef8abbee2f98272ca0aa678450db6a38"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"
