SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "9a81d2651bb663b65d5c1671af573a1a"
SRC_URI[sha256sum] = "2fce8fe2294ec26a1943c44a547cfd1a2b3e7044e5b571bebd0aef5c7812da79"

CMAKE_ALIGN_SYSROOT[1] = "KF5ItemModels, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemModels, -S${includedir}, -S${STAGING_INCDIR}"

