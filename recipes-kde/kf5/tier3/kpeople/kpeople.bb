SUMMARY = "Provides access to all contacts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 gettext

DEPENDS += "kcoreaddons \
            kcoreaddons-native \
            kconfig \
            kconfig-native \
            kservice \
            kwidgetsaddons \
            ki18n \
            kitemviews"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "dfd40293bf9e8497e7563ab67d3a3eb5"
SRC_URI[sha256sum] = "d63d5f5cbbedc2e4ef85fa8c2ff4adcd5cb9e05d1d1ee0e7b2c2d151193f5403"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
