SUMMARY = "PolicyKit Qt wrapper"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=7dbc59dc445b2261c4fb2f9466e3446a"

inherit kde cmake-lib

DEPENDS += "polkit glib-2.0"

SRCREV = "40afa675bfa4cacd95487ce8b0544654c5f34e21"
S = "${WORKDIR}/git"

CMAKE_HIDE_ERROR[1] = "PolkitQt5-1, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "PolkitQt5-1, -S${includedir}, -S${STAGING_INCDIR}"
