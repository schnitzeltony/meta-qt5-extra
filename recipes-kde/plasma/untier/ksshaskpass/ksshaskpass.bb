SUMMARY = "ssh-add helper that uses kwallet and kpassworddialog"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kcoreaddons-native kcoreaddons \
    kdoctools-native kdoctools \
    ki18n \
    kwallet \
    kwidgetsaddons \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "34c5d4f196d09c4ebe8990d3761bc70059436e272ad46a761e71b5910e0f44dd"
