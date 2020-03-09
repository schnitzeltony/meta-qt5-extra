SUMMARY = "QCA provides a straightforward and cross-platform crypto API"
LICENSE = "LGPLv2.1"
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
SRC_URI[md5sum] = "139829d029fe70248f0b059b43dc4316"
SRC_URI[sha256sum] = "1d68ef41a1b61dc9786beb923a68902a6276a77cced5e5ea7ff985ef113932d7"
PV = "2.3.0"

EXTRA_OECMAKE += " \
    -DQCA_FEATURE_INSTALL_DIR=${libdir}${QT_DIR_NAME}/mkspecs/features \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"

FILES_${PN} += "${libdir}/qca-qt5/crypto"

CMAKE_ALIGN_SYSROOT[1] = "Qca-qt5, -S${libdir}/lib, -s${OE_QMAKE_PATH_HOST_LIBS}/lib"
CMAKE_ALIGN_SYSROOT[2] = "Qca-qt5, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"

