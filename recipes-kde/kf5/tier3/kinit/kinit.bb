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
SRC_URI[md5sum] = "4d914c5ae3010ae600c858e9ccdeecb2"
SRC_URI[sha256sum] = "22c2adb9b1b52d0f90db9c36bd0313250d986a207f781c0582e85c4805297e53"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dev = "${libdir}/cmake"
