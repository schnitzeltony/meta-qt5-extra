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
SRC_URI[sha256sum] = "8386c5108fd761aa5b4b8dbd25f36b021c0bf3a42127e41916c8cd646b99c35f"
