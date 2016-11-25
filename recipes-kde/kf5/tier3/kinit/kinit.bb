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
SRC_URI[md5sum] = "dea7beb4a98462d0098e7abd6397264f"
SRC_URI[sha256sum] = "22a4dc26cb941c00422bc89b6946b870fb6c32672a7eaedf28bb4049ad228a43"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
FILES_${PN}-dev = "${libdir}/cmake"
