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
SRC_URI[md5sum] = "9d1d3fa10ac9c949f2f2eaa9001bcc9f"
SRC_URI[sha256sum] = "7634f22b5250fc8d283d9d12cacee72d9427ef0b86b0c0e97339c3d2e233f4c4"

SRC_URI += " \
    file://0001-return-WAYLAND_DISPLAY-if-all-known-options-fail.patch \
    file://0002-kdeinit-fix-paths-to-libraries.patch \
"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
FILES_${PN}-dev = "${libdir}/cmake"
