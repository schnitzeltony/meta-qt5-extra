SUMMARY = "Provides access to all contacts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kconfig kservice kwidgetsaddons ki18n kitemviews "

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1187211cdeb40a5a88021448fd57a806"
SRC_URI[sha256sum] = "58b2ddd740aee6c53357883c662b45aa87bf979efeae3fb64e4aee9f1ed9d759"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5People, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5People, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/*/*/*/.debug"
