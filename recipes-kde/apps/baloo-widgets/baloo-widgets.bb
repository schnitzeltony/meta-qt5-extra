SUMMARY = "Widgets for Baloo"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING.README;md5=f5d7c5af660f94231a1d4e19501bce8f \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-apps

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
SRC_URI[md5sum] = "5d3f8f89d833033794b170e6b9db4cbd"
SRC_URI[sha256sum] = "4bff2f4abd9d65f39e2b44189312bac139908362e8888c114bbf3d107902217c"
