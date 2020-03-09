SUMMARY = "A BitTorrent protocol implementation"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

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

PV = "2.1.1"
SRC_URI = " \
    https://download.kde.org/stable/ktorrent/5.1.2/libktorrent-${PV}.tar.xz \
    file://0001-Find-libgmp-with-pkgconfig.patch \
"
SRC_URI[md5sum] = "7404820abdc89bc4ad4331878b218178"
SRC_URI[sha256sum] = "5cc45c0b50a1b6b2ce64ad0384128f4ac3bc0e4a1417eb58e5e992b510fca100"
