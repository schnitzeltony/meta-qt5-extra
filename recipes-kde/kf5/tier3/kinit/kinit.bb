SUMMARY = "Process launcher to speed up launching KDE applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    libcap \
    kservice \
    kio \
    ki18n \
    kwindowsystem \
    kcrash \
    kconfig \
    kdoctools \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "09ce4488755c84d1184ecea5438e2749"
SRC_URI[sha256sum] = "cdfac3c156de16b900e4480c407e5352749f94b09ec42d9c95b358013995de1a"

SRC_URI += " \
    file://0001-return-WAYLAND_DISPLAY-if-all-known-options-fail.patch \
    file://0002-kdeinit-fix-paths-to-libraries.patch \
"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
FILES_${PN}-dev = "${libdir}/cmake"
