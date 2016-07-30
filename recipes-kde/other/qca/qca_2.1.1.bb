SUMMARY = "QCA provides a straightforward and cross-platform crypto API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=fbc093901857fcd118f065f900982c24 \
"

inherit kde-base cmake-lib

# TBD: PACKAGECONFIG
DEPENDS += " \
    qtsvg \
    nss \
    cyrus-sasl \
    libgcrypt \
    pkcs11-helper \
"

SRC_URI[md5sum] = "657cc701316600199199a6b6cb2c73c9"
SRC_URI[sha256sum] = "95de3e7910b5f9ec7084169989c9d98bfb527e6a4865fe17269c3b24308be983"
SRC_URI += " \
    file://0001-use-pkg-config-to-find-libgcrypt.patch \
    file://0002-fix-base64-decoding-on-ARM.patch \
"

EXTRA_OECMAKE += "-DQCA_FEATURE_INSTALL_DIR=${libdir}${QT_DIR_NAME}/mkspecs/features"

FILES_${PN} += "${libdir}/qca-qt5/crypto"
FILES_${PN}-dbg += "${libdir}/qca-qt5/crypto/.debug"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "Qca-qt5, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "Qca-qt5, -S${includedir}, -S${STAGING_INCDIR}"
