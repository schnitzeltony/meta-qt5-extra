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
SRC_URI[md5sum] = "96fbeebe281f81a962ef809a9250bcc1"
SRC_URI[sha256sum] = "8f90340c3640623781772f76e33357856c0781b15153afea30f9e31dd1863e0c"
