SUMMARY = "Process launcher to speed up launching KDE applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

DEPENDS += "libcap kservice kio ki18n kwindowsystem kcrash kconfig kdoctools"

SRCREV = "14620f5d142ebc4f24fb29f3277489627226e6ce"
SRC_URI += "file://0001-return-WAYLAND_DISPLAY-if-all-known-options-fail.patch"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
FILES_${PN}-dev = "${libdir}/cmake"
