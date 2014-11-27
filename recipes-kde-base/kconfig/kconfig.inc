SUMMARY = "KDE configuration system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

SRC_URI += " \
	file://0001-Make-sessionConfig-optional.patch \
	file://0002-Make-autotests-optional-enabled-by-default.patch \
"
SRCREV = "f844f6a85e4bce35d0802eed11b19916d34ed78c"
PV = "5.5.0"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF -DSESSION_MANAGEMENT=${@base_contains("DISTRO_FEATURES", "x11", "ON", "OFF", d)}"

PACKAGES =+ "${PN}-bin"

FILES_${PN}-dbg += "${libdir}/kconfig/kf5/.debug"
FILES_${PN}-bin = "${bindir}/k*"

