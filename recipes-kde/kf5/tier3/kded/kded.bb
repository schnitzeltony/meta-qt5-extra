SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

DEPENDS += "${BPN}-native kconfig kcoreaddons kcrash kdbusaddons kdoctools kinit kservice \
            kconfig-native kcoreaddons-native kdoctools-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "55e4ea83c260ed6133d91baa85e83ee2"
SRC_URI[sha256sum] = "2f5193bfd922d51d3b343bbd370a9a67361f5176b368200304c96eb4ec909583"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

# kded's kded5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[1] = "KDED, -s${_IMPORT_PREFIX}/bin/kded5, -s${KDE_PATH_EXTERNAL_HOST_BINS}/kded5"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
