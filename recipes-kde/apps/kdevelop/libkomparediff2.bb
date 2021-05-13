SUMMARY = "Library to compare files and strings, used in Kompare and KDevelop"
LICENSE = "GPL-2.0 & LGPL-2.0"
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
SRC_URI[sha256sum] = "eced4e239b40278dcfff529db6f433c997c80da0c77faadf6a9b7c39d26ebdfe"
