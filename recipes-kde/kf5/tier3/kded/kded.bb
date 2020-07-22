SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    kconfig-native kconfig \
    kdoctools-native kdoctools \
    kcoreaddons-native kcoreaddons \
    kcrash \
    kdbusaddons \
    kinit \
    kservice \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "eab73ad2acd861efda559e52278d6ee8"
SRC_URI[sha256sum] = "b3a2c2f99554add10219ccb52edce4503001206662195a26e2a093fb815318ab"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${libdir}/libkdeinit5_kded5.so \
    ${systemd_user_unitdir} \
"
FILES_${PN}-dev = "${libdir}/cmake"
