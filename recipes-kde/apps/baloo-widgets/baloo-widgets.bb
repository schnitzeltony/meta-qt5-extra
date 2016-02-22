SUMMARY = "Widgets for Baloo"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING.README;md5=f5d7c5af660f94231a1d4e19501bce8f \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-apps cmake-lib

DEPENDS += "\
    kconfig \
    kio \
    ki18n \
    kservice \
    kfilemetadata \
    baloo \
    kdelibs4support \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "b20808f6099b1dc4fa8a22b7f0283e7c"
SRC_URI[sha256sum] = "cedfa8355e92dc935326f3cfe39cd800b4559320b6fe6567f6428cf00b7871c0"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BalooWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BalooWidgets, -S${includedir}, -S${STAGING_INCDIR}"

