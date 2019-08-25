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
SRC_URI[md5sum] = "f20ed3efe486b9a6b909ac8adf3c6c38"
SRC_URI[sha256sum] = "1806bba9cc3f4d9c5ed23f49eca30707e8f74a99d35f5022130a46a395f2858f"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dev = "${libdir}/cmake"
