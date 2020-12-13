SUMMARY = "Widgets for Baloo"
LICENSE = "LGPL-2.0"
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
SRC_URI[sha256sum] = "9af708f4749effb02a87ef37decb3bd3cfe1365521290a49093f86da93dd1aa2"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
