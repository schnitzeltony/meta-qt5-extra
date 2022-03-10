SUMMARY = "PolicyKit Qt wrapper"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=7dbc59dc445b2261c4fb2f9466e3446a"

inherit kde-base cmake_lib features_check

REQUIRED_DISTRO_FEATURES = "polkit"

DEPENDS += "polkit glib-2.0"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "5b866a2954ef10ffb66156e2fe8ad0321b5528a8df2e4a91b02f5041ce5563a7"

CMAKE_ALIGN_SYSROOT[1] = "PolkitQt5-1, -S${libdir}, -s${OE_QMAKE_PATH_HOST_LIBS}/"
CMAKE_ALIGN_SYSROOT[2] = "PolkitQt5-1, -s${POLKITQT-1_LIB_DIR}, -s${OE_QMAKE_PATH_HOST_LIBS}"
CMAKE_ALIGN_SYSROOT[3] = "PolkitQt5-1, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
CMAKE_ALIGN_SYSROOT[4] = "PolkitQt5-1, -s${PACKAGE_PREFIX_DIR}/include, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
