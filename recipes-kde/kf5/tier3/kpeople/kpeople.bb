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
SRC_URI[md5sum] = "1619857367617b30be7a9410a8a2cd28"
SRC_URI[sha256sum] = "86c91687c719149099e686a2c322c4b790a4503a0567250fb6cf2dc293c89296"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
