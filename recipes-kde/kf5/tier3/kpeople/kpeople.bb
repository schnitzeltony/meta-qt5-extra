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
SRC_URI[md5sum] = "fb175e8643f8d70a0aaac2296b7afeac"
SRC_URI[sha256sum] = "79e6d54a1b5c3d41717cb94898ab52a5e0c6187a069cb1e35cd4930ee5348540"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
