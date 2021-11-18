SUMMARY = "A BitTorrent protocol implementation"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24"

inherit kde-apps gettext

DEPENDS += " \
    ki18n-native \
    kcoreaddons-native \
    kconfig-native \
    kauth-native \
    boost \
    gmp \
    qca \
    karchive \
    kcrash \
    kio \
    solid \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "a666d7c36fe4f6a8f960afb6605cd4c7aac5cb8048e41c8c8b6957d060b756fe"
SRC_URI += "file://0001-Find-libgmp-with-pkgconfig.patch"
