SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_lib

DEPENDS += "${BPN}-native kconfig kcoreaddons kcrash kdbusaddons kdoctools kinit kservice"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "914e57ee540bf2e154cdc86f962b50ad"
SRC_URI[sha256sum] = "c5367c38ba8bcfef0af44320ead4462230e69cc3f1ae5494fd1cfab6c7e4be84"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

# kded's kded5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[1] = "KDED, -s${_IMPORT_PREFIX}/bin/kded5, -S${STAGING_BINDIR_NATIVE}/kded5"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
