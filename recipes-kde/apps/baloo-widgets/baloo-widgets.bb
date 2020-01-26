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
SRC_URI[md5sum] = "8e1ee0334c760455b685c2e1fd754410"
SRC_URI[sha256sum] = "a9fb3a136267bb0089192f7bc523903bd304e528160d9f653ccd052b4a8c110c"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
