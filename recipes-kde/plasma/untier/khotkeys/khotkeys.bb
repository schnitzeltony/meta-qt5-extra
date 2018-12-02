SUMMARY = "KHOTKEYS"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdesignerplugin-native \
    sonnet-native \
    kpackage-native \
    kglobalaccel \
    ki18n \
    kio \
    kxmlgui \
    kdelibs4support \
    kdelibs4support-native \
    kdbusaddons \
    kcmutils \
    plasma-framework \
    plasma-workspace \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c38e8d0902ba37f5308cb7f05047072b"
SRC_URI[sha256sum] = "a267fac05ace69522a5972f6e5cba2436ffc9ac8e386d30c8da0f15aa2f47a0c"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
"
