SUMMARY = "ssh-add helper that uses kwallet and kpassworddialog"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kcoreaddons \
    kcoreaddons-native \
    ki18n \
    kwallet \
    kwidgetsaddons \
    kdoctools-native \
"

# REVISIT optionals
DEPENDS += " \
    kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "f7dd2fa8d28ac4a673a9af0694f73c96caea63ae96ad836b9aa7a8055067e245"
