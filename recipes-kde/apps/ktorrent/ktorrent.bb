SUMMARY = "A powerful BitTorrent client"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kdoctools-native \
    libktorrent \
    knotifyconfig \
    kcmutils \
    kparts \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "f359d69fd8fd9125b2738d72c55a2ee286556b5c1fd25a0c8fdda1ffda08d8b2"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
    ${datadir}/kxmlgui5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
