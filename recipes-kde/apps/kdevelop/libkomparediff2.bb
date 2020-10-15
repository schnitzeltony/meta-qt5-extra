SUMMARY = "Library to compare files and strings, used in Kompare and KDevelop"
LICENSE = "GPLv2 & LGPLv2"
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
SRC_URI[sha256sum] = "91b0b72d5c4e2ddd863636cca299660bfbb5b7a55773cbc51000fe9c1ca91a98"
