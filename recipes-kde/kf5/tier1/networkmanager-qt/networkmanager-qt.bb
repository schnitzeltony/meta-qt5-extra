SUMMARY = "Qt wrapper for NetworkManager API"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib pkgconfig

DEPENDS += "networkmanager"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fbac640d46ec3e3ff173c12a5c30a072"
SRC_URI[sha256sum] = "535e6b04fa041c38bb9af1bf4aea293ee5ae4f9883df7dd1cb0e1671b5dca1d3"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5NetworkManagerQt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5NetworkManagerQt, -S${includedir}, -S${STAGING_INCDIR}"

#FILES_${PN} += "${datadir}/k*5"
