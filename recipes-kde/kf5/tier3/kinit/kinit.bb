SUMMARY = "Process launcher to speed up launching KDE applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    libcap \
    kservice \
    kio \
    ki18n \
    kwindowsystem \
    kcrash \
    kconfig \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kdoctools \
    kdoctools-native \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9d6893978fcb67c4d993cd30087d0ca2"
SRC_URI[sha256sum] = "7d5ca84d7bd554531aa6d720d3dc41ac091cf047a52d097a23e5c8fad08b684c"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dev = "${libdir}/cmake"
