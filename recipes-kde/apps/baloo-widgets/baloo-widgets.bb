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
SRC_URI[md5sum] = "94b6e609427ca2aacec03d1958ba945d"
SRC_URI[sha256sum] = "ea4f60c59c9fc912b51df46425fc9ca0947320bffed8deaeb38ea17436be5b51"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5BalooWidgets, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5BalooWidgets, -S${includedir}, -S${STAGING_INCDIR}"

