SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kcoreaddons kcrash kdbusaddons kdoctools kinit kservice"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "b1c65c8fb85a6a7bd574694fdb1ec044"
SRC_URI[sha256sum] = "e3fe0ef4adcf13b51944b52835ab886e8572dc82fa177a7d1fc4337563a38604"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KDED, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KDED, -S${includedir}, -S${STAGING_INCDIR}"

# executables REVISIT -> native 
CMAKE_HIDE_ERROR[3] = "KDED, -S${bindir}, -S${STAGING_BINDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
