SUMMARY = "Provides access to all contacts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kconfig kservice kwidgetsaddons ki18n kitemviews "

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2f67512dc135ee4f9c87ddb2b02a6e9e"
SRC_URI[sha256sum] = "e1f75756b344d11784a59dd8a37346e8115e15e6c7fcfb7face6ee3277d2097f"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5People, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5People, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${libdir}/${QT_DIR_NAME}/qml \
"
FILES_${PN}-dbg += "${libdir}/${QT_DIR_NAME}/qml/*/*/*/.debug"
