SUMMARY = "Add support for global workspace shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kcrash \
    kdbusaddons \
    kservice \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "14ddf20e92da05618d48262b2cfbe6ef"
SRC_URI[sha256sum] = "caf05b77cd387ce21c7571fdf16e6d5e7b4337de1d73c0e9764b760c0e6e62c4"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
"
