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
SRC_URI[md5sum] = "ede339e08f7432f94ab85093241e104c"
SRC_URI[sha256sum] = "1bce022f72a32b4e3a3673f46c6dc681aaa61b12bcdd36d8dd1a5e295a68b744"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/*/*/*/.debug"
