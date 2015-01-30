SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt cmake-lib

# libmagic is supplied by file
DEPENDS += "file"

SRCREV = "d98585a5519e0aba2c6290ddb652953515170b2f"
PV = "1.0.0+git${SRCPV}"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_PREFIX=''"

CMAKE_HIDE_ERROR[1] = "qt5xdg, -S${includedir}, -S${STAGING_INCDIR}"
CMAKE_HIDE_ERROR[2] = "qt5xdg, -S${libdir}, -S${STAGING_LIBDIR}"
