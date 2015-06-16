SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

# libmagic is supplied by file
DEPENDS += "file"

SRC_URI += " \
    file://0001-do-not-add-CMAKE_INSTALL_PREFIX-to-header-install-lo.patch \
    file://0002-remove-prefix-from-packageconfig.patch \
"
SRCREV = "da936792f2376327db2c287348738ede394e7bcc"
PV = "1.2.0"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_PREFIX=''"

CMAKE_ALIGN_SYSROOT[1] = "qt5xdg, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_ALIGN_SYSROOT[2] = "qt5xdg, -S${libdir}, -S${STAGING_LIBDIR}"
