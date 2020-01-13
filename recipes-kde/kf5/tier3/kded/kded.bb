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
SRC_URI[md5sum] = "ff63f0d461192f93072311f0dc81d901"
SRC_URI[sha256sum] = "52223e641c4e8e3158220ed7b6c48e4c3f3e67f882603ada0e3757b4136255a4"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
