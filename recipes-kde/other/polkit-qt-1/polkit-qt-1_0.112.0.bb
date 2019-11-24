SUMMARY = "PolicyKit Qt wrapper"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=7dbc59dc445b2261c4fb2f9466e3446a"

inherit kde-base cmake_lib features_check

REQUIRED_DISTRO_FEATURE = "polkit"

DEPENDS += "polkit glib-2.0"

SRC_URI = "${KDE_MIRROR}/stable/apps/KDE4.x/admin/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "bee71b71c12797e6fc498540a06c829b"
SRC_URI[sha256sum] = "67fb03bf6ca3e0bdbd98d374dfb5b1651a07d17ae6c23e11a81b4b084447e7c6"

CMAKE_ALIGN_SYSROOT[1] = "PolkitQt5-1, -S${libdir}, -s${OE_QMAKE_PATH_HOST_LIBS}/"
CMAKE_ALIGN_SYSROOT[2] = "PolkitQt5-1, -s${POLKITQT-1_LIB_DIR}, -s${OE_QMAKE_PATH_HOST_LIBS}"
CMAKE_ALIGN_SYSROOT[3] = "PolkitQt5-1, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
CMAKE_ALIGN_SYSROOT[4] = "PolkitQt5-1, -s${PACKAGE_PREFIX_DIR}/include, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
