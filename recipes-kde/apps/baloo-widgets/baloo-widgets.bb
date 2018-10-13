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
SRC_URI[md5sum] = "e185fc90d1df845f71eeaaa175b9c9e3"
SRC_URI[sha256sum] = "0fa393bd12bbb709ce242a604fc1649992a4cb2dca0d6c9b055610f123c42d27"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
