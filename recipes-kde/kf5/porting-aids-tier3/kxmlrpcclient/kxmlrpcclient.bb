SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD-2-Clause & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5-porting-aids gettext

DEPENDS += "ki18n kio kcoreaddons-native kconfig-native kauth-native"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "916f8c243b54e70dc956a0e80c97de81b785c2d1bbc625c8e650062708d5c4dd"
