SUMMARY = "Provides access to all contacts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5

DEPENDS += "kcoreaddons kconfig kservice kwidgetsaddons ki18n kitemviews "

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "635abe2abc2d0fbd68b8338ae1907326"
SRC_URI[sha256sum] = "120a32017815a5442574d627a8a48d7c825088162332051d033c88603277e2c0"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/*/*/*/.debug"
