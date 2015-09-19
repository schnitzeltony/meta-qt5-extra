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
SRC_URI[md5sum] = "8be76053816d783e41c1975c8ec85219"
SRC_URI[sha256sum] = "6ced28e631afcfbf72b2af8fa9d933d179ffec26aff15a96680aaa8a777c3408"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BalooWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BalooWidgets, -S${includedir}, -S${STAGING_INCDIR}"

