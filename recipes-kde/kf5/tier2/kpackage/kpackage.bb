SUMMARY = "Library to load and install packages of non binary files as they were a plugin"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "karchive ki18n kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ddb92846ff8b8d4a81e3649b4c4c2672"
SRC_URI[sha256sum] = "f8f53cb74f123b8219f67dbb781b60b524e16304d34f38fc96a9da293496d470"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Package, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Package, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5"
