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
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b7efe78d929ce60c2f6d6f91ffb99da5"
SRC_URI[sha256sum] = "e4c31aa5abb56be283691b7e7d08498b8cec85d960d760c9a188af2dcdedcdb0"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
