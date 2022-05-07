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
SRC_URI[sha256sum] = "9c9ff478d4e31cc0b0dc980238956d92f683e6ff55dc1c6b67e3212c7e7e0711"
