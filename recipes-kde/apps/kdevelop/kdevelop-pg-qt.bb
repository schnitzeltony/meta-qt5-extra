SUMMARY = "KDevelop-PG-Qt is a parser generator"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=15ce55ef03e0531acfa5ca508b9f85b2"

inherit kde-base

DEPENDS += "qtbase"

PV = "2.2.1"
SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/src/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "c13931788ac9dc02188cdd9c6e71e164ae81b4568b048748652bbf6fa4a9c62b"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

BBCLASSEXTEND = "native"
