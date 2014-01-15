DESCRIPTION = "Reading, creating, and manipulating file archives"
LICENSE = "GPLv2 LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit cmake_qt5

DEPENDS = "qtbase kde-extra-cmake-modules-native bzip2 xz"

SRC_URI = " \
	git://anongit.kde.org/karchive;protocol=git;branch=master \
	file://0001-set-mkspec-path-as-set-in-meta-qt5.patch \
"
SRCREV = "f7901cf4201a603fef641d6266578c9447f7d40b"
PV = "4.95.0+git${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
	-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools \
	-DCMAKE_INSTALL_PREFIX=${prefix}"

FILES_${PN}-dev += " \
	${libdir}/cmake \
	${libdir}/qt5 \
"
