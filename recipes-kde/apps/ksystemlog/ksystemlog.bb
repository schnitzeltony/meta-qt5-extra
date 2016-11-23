SUMMARY = "KDE SystemLog Application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kxmlgui \
    kcoreaddons \
    kwidgetsaddons \
    kitemviews \
    kio \
    kconfig \
    karchive \
    kdoctools \
    kcompletion \
    ktextwidgets \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "999f40f9b4b7f574d5c7946358ae6f24"
SRC_URI[sha256sum] = "181a217e7a40abed60575d95c466666f7a26c27d7143b35df91c96496a5abdb0"

FILES_${PN} += "${datadir}/kxmlgui5"
