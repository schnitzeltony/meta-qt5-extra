SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

DEPENDS += "${BPN}-native kconfig kcoreaddons kcrash kdbusaddons kdoctools kinit kservice"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ad5efaca89d6cd92cf1fbe8be6e1e4ff"
SRC_URI[sha256sum] = "2d67d51c7ae8c60a329a8aaa55bddb4ce09b52d5aa4ba6583175441063b715eb"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

# kded's kded5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[1] = "KDED, -s${_IMPORT_PREFIX}/bin/kded5, -S${STAGING_BINDIR_NATIVE}/kded5"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
