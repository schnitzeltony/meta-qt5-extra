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
SRC_URI[md5sum] = "694b8640be69230123758181d7678455"
SRC_URI[sha256sum] = "04327dda12fa547bebb8e1b1bc26373e8f4174007dd629231403d59ce004201f"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
