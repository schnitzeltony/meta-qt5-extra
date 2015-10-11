SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "${BPN}-native kconfig kcoreaddons kcrash kdbusaddons kdoctools kinit kservice"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4d4981a6700dc77fc5d9c2d4ef964c2b"
SRC_URI[sha256sum] = "98330b8512dbc06f35b93edd85ac6777c84c960a9492dd38c670d567ba749490"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KDED, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KDED, -S${includedir}, -S${STAGING_INCDIR}"

# kded's kded5 is not required for build -> point to native dummy to make cmake happy
CMAKE_ALIGN_SYSROOT[3] = "KDED, -S${bindir}/kded5, -S${STAGING_BINDIR_NATIVE}/kded5"

FILES_${PN} += "${datadir}/dbus-1 ${datadir}/k*5 ${libdir}/libkdeinit5_kded5.so"
FILES_${PN}-dev = "${libdir}/cmake"
