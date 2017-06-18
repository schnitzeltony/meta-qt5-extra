SUMMARY = "Widgets for Baloo"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING.README;md5=f5d7c5af660f94231a1d4e19501bce8f \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kio \
    ki18n \
    kservice \
    kfilemetadata \
    baloo \
    kdelibs4support \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "f88e8f1510040cec4a74d98acb3b5231"
SRC_URI[sha256sum] = "3a181dba19586cd26fa009b91abf3428df00f8beb9afb6e7959877d6b58f8069"
