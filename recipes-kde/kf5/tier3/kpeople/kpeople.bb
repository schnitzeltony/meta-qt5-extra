SUMMARY = "Provides access to all contacts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kconfig kservice kwidgetsaddons ki18n kitemviews "

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "bb7bc4b9d6f1433538692d63506bac86"
SRC_URI[sha256sum] = "28717278348fbcc5dd0b7296804417e3a18aaa9a7c339430993d441ace334ecf"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5People, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5People, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/*/*/*/.debug"
