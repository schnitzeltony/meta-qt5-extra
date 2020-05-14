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
SRC_URI[md5sum] = "e23ae6b5edc1eab71bc9efb0e4478579"
SRC_URI[sha256sum] = "719abdd2ff3c0d60083190177d021fdd9d9d7b06c7e949ae935db57091869cf4"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dev = "${libdir}/cmake"
