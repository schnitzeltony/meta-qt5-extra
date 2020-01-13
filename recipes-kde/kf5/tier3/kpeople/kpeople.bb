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
SRC_URI[md5sum] = "5b5774f99987e15e6ef0d502237bd3e2"
SRC_URI[sha256sum] = "2728f08a9417ceb62aa9fc5a3340aed291aeb8a852e5f6f46c5a23fcc34168ab"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
