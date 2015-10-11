SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "karchive ki18n kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c62075c90e8717d213a3aa4106f355b7"
SRC_URI[sha256sum] = "c3eeca1f1320ceed8bd87617c93b8bb847a915b0a9f6a4fe3d665de129b6ec0f"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Package, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Package, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5"
