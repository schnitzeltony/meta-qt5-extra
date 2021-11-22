SUMMARY = "Provides access to all contacts"
LICENSE = "LGPL-2.1+"
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
SRC_URI[sha256sum] = "ceafb9690010c7c4a075aefc96cc721cf976cfedc3e4822a1bca5ff2916c6cdd"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
