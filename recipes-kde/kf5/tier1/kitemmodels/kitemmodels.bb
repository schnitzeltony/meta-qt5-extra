SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "06df86fdacf8bb20d74f410496039d48"
SRC_URI[sha256sum] = "c9403de0a6a155931cb96790dc1407c06d95ee096a5ab9795bbfe11bb82537e8"

CMAKE_ALIGN_SYSROOT[1] = "KF5ItemModels, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5ItemModels, -S${includedir}, -S${STAGING_INCDIR}"

