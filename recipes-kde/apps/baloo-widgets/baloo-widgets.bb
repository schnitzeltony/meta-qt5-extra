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
SRC_URI[md5sum] = "d131f6dec4f4e50d52657087403e4c05"
SRC_URI[sha256sum] = "b8475ba1a74f8ebc6a36029b60ac803ab0d2c81c253b8c16bd05b6249454c3e3"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
