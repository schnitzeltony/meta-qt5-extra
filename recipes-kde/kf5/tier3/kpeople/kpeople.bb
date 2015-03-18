SUMMARY = "Provides access to all contacts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kconfig kservice kwidgetsaddons ki18n kitemviews "

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5effd861add4d39d0bd3756b17fa814c"
SRC_URI[sha256sum] = "0516f8df4992bdae2ff57425bfce84e14d45635cc6697b11a9111ed8b5e2a2c5"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5People, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5People, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/qml \
"
FILES_${PN}-dbg += "${libdir}/qml/*/*/*/.debug"
