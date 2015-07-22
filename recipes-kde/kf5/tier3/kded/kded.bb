SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kconfig kcoreaddons kcrash kdbusaddons kdoctools kinit kservice"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f9d80602631659b3960358470dfad836"
SRC_URI[sha256sum] = "ddcfecfd23d88e7edbe27a7b0d2474cfab2b82a096a2e32b9b81fc39037be6a0"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KDED, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KDED, -S${includedir}, -S${STAGING_INCDIR}"

# executables REVISIT -> native 
#CMAKE_ALIGN_SYSROOT[3] = "KDED, -S${bindir}, -S${STAGING_BINDIR}"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
