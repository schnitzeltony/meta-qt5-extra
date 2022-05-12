SUMMARY = "A BitTorrent protocol implementation"
LICENSE = "BSD-3-Clause & CC0-1.0 & GPL-2.0-or-later & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
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

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "57dd46edc9e10127bca69104b0288bdfa5f1dab261f89d8fa4b2161ab7e7ddca"
SRC_URI += "file://0001-Find-libgmp-with-pkgconfig.patch"
