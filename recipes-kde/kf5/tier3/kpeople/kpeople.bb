SUMMARY = "Provides access to all contacts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons kconfig kservice kwidgetsaddons ki18n kitemviews "

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "ab52947f23feeb9a91b867fea2fe8d54"
SRC_URI[sha256sum] = "fa650023b92def431e2dca957dc46bf352c471e6992371715dc2e26cd4aad985"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5People, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5People, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML} \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/*/*/*/.debug"
