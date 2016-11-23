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
SRC_URI[md5sum] = "e1caaee7600dd49b2c6f920778b429bb"
SRC_URI[sha256sum] = "75448e26811b098f93dcb936d5f76c94d30fde618a7ac9661008db7d9d04f513"
