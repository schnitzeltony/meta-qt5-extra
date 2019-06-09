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
SRC_URI[md5sum] = "df4707b0ce1413af64432d0b06003424"
SRC_URI[sha256sum] = "8c1f440e3b27a3e6294ba8439a9c15f039af66f18db64d285da247b9d577ee41"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
