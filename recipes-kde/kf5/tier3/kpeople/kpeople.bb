SUMMARY = "Provides access to all contacts"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kcoreaddons \
    kcoreaddons-native \
    kconfig \
    kconfig-native \
    kservice \
    kwidgetsaddons \
    ki18n \
    kitemviews \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "217eba378c223e3518914512fc303a106101d26fa1a8fc57495abbd0d36a5274"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
