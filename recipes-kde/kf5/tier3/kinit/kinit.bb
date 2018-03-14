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
SRC_URI[md5sum] = "6d1095cdcdf1a38a1866436e0dbc6d59"
SRC_URI[sha256sum] = "e5a7ff6f7f04175538ffbec7c311162f9e0bc7eb41c1b3c718e9f9012bad7fec"

FILES_${PN} += "${datadir}/dbus-1 ${libdir}/libkdeinit5_klauncher.so"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
FILES_${PN}-dev = "${libdir}/cmake"
