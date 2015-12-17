SUMMARY = "PolicyKit Qt wrapper"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=7dbc59dc445b2261c4fb2f9466e3446a"

inherit kde-base cmake-lib

DEPENDS += "polkit glib-2.0"

SRC_URI = "${KDE_MIRROR}/stable/apps/KDE4.x/admin/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "bee71b71c12797e6fc498540a06c829b"
SRC_URI[sha256sum] = "67fb03bf6ca3e0bdbd98d374dfb5b1651a07d17ae6c23e11a81b4b084447e7c6"

CMAKE_ALIGN_SYSROOT[1] = "PolkitQt5-1, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "PolkitQt5-1, -S${includedir}, -S${STAGING_INCDIR}"
