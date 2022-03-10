SUMMARY = "QCA provides a straightforward and cross-platform crypto API"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

inherit kde-base cmake_lib

# TBD: PACKAGECONFIG
DEPENDS += " \
    qtsvg \
    nss \
    cyrus-sasl \
    libgcrypt \
    pkcs11-helper \
"

SRC_URI = " \
    https://download.kde.org/stable/${BPN}/${PV}/${BP}.tar.xz \
    file://0001-use-pkg-config-to-find-libgcrypt.patch \
"
SRC_URI[sha256sum] = "6b695881a7e3fd95f73aaee6eaeab96f6ad17e515e9c2b3d4b3272d7862ff5c4"
PV = "2.3.4"

EXTRA_OECMAKE += " \
    -DQCA_FEATURE_INSTALL_DIR=${libdir}${QT_DIR_NAME}/mkspecs/features \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"

FILES:${PN} += "${libdir}/qca-qt5/crypto"

CMAKE_ALIGN_SYSROOT[1] = "Qca-qt5, -S${libdir}/lib, -s${OE_QMAKE_PATH_HOST_LIBS}/lib"
CMAKE_ALIGN_SYSROOT[2] = "Qca-qt5, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"

