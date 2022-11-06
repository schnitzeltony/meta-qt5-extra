SUMMARY = "PolicyKit Qt wrapper"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
"

inherit kde-base cmake_lib features_check

REQUIRED_DISTRO_FEATURES = "polkit"

DEPENDS += "polkit glib-2.0"

PV = "0.114.0"
SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "2eb0f22445888295ffa2bfbc0c3693847a0f973bb6b0c3e4cce0218be7e3907e"

CMAKE_ALIGN_SYSROOT[1] = "PolkitQt5-1, -S${libdir}, -s${OE_QMAKE_PATH_HOST_LIBS}/"
CMAKE_ALIGN_SYSROOT[2] = "PolkitQt5-1, -s${POLKITQT-1_LIB_DIR}, -s${OE_QMAKE_PATH_HOST_LIBS}"
CMAKE_ALIGN_SYSROOT[3] = "PolkitQt5-1, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
CMAKE_ALIGN_SYSROOT[4] = "PolkitQt5-1, -s${PACKAGE_PREFIX_DIR}/include, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
