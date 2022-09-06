SUMMARY = "Library to compare files and strings, used in Kompare and KDevelop"
LICENSE = "GPL-2.0-only & LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=8d8cc811a0870dd8391a69e61a77967a"

inherit kde-apps gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    ki18n-native \
    kcodecs \
    kio \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "5d841c92d909e522e2f4a5bb452edc6ab3ab9d780b5a02a7b3b33998020bede8"
