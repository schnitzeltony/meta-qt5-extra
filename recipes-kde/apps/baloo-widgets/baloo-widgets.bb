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
SRC_URI[md5sum] = "6d7a49beea02aaaf41dab19af84caa87"
SRC_URI[sha256sum] = "fa46000d08ea30a48880ac3e6da4896dd222d63374c0d73f23982d962190d1a6"
