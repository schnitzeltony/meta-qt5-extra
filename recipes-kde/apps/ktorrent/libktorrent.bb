SUMMARY = "A BitTorrent protocol implementation"
LICENSE = "GPLv2"
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

PV = "2.2.0"
SRC_URI = " \
    https://download.kde.org/stable/ktorrent/5.2.0/libktorrent-${PV}.tar.xz \
    file://0001-Find-libgmp-with-pkgconfig.patch \
"
SRC_URI[md5sum] = "5d3ba5142103cd0cf9e618a2ed12de66"
SRC_URI[sha256sum] = "77c1ddfb0a56c40227e0624c078836a8c22bf5a2fb4a3c0cbd53ee6b174c126e"
