SUMMARY = "QCA provides a straightforward and cross-platform crypto API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=fbc093901857fcd118f065f900982c24 \
"

inherit kde-base cmake_lib cmake_auto_align_paths

# TBD: PACKAGECONFIG
DEPENDS += " \
    qtsvg \
    nss \
    cyrus-sasl \
    libgcrypt \
    pkcs11-helper \
"

SRC_URI = " \
    git://github.com/KDE/qca.git \
    file://0001-use-pkg-config-to-find-libgcrypt.patch \
"
SRCREV = "db5f82be2ad72658f7b575ebd1e97f4748033d04"
S = "${WORKDIR}/git"
PV = "2.2.1+git${SRCPV}"

EXTRA_OECMAKE += " \
    -DQCA_FEATURE_INSTALL_DIR=${libdir}${QT_DIR_NAME}/mkspecs/features \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"

FILES_${PN} += "${libdir}/qca-qt5/crypto"

CMAKE_ALIGN_SYSROOT[1] = "Qca-qt5, -S${libdir}/lib, -s${OE_QMAKE_PATH_HOST_LIBS}/lib"
CMAKE_ALIGN_SYSROOT[2] = "Qca-qt5, -S${includedir}, -s${CMAKE_QT5_EX_PATH_HOST_HEADERS}"
