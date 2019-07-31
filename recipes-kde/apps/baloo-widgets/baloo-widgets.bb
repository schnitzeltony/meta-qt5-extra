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
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "846e89e3a986015d3dca33383ee7094d"
SRC_URI[sha256sum] = "ee14c03ac8254a0d0680bce856178a2110f0339b9dd5021927c59ff2df90606f"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
