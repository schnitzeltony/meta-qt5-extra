SUMMARY = "Library for working with contact information"
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & MIT & Unicode-DFS-2016"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/Unicode-DFS-2016.txt;md5=3daac258519ec32945c80ae0f7ba88f4 \
"

inherit kde-kf5 gettext features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    kconfig-native \
    kcoreaddons-native \
    kcoreaddons \
    kconfig \
    ki18n \
    kcodecs \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "1b067820de0370a0da43b069f4c9cafb411bb201fcbb112b9743fb9d134b03b1"
