SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

DEPENDS += "${BPN}-native kconfig kcoreaddons kcrash kdbusaddons kdoctools kinit kservice \
            kconfig-native kcoreaddons-native kdoctools-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5d988b80af68a939723e7122d80deddf"
SRC_URI[sha256sum] = "8b96b50313783b5edcf5bb8a0bc4873a844cb1ca662feb0ace9a932e8bfc5277"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

# kded's kded5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[1] = "KDED, -s${_IMPORT_PREFIX}/bin/kded5, -s${KDE_PATH_EXTERNAL_HOST_BINS}/kded5"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
