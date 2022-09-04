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
SRC_URI[sha256sum] = "7f46c90f6982487c5bce9e93fc1a418868804b63d67aa65e54eac54f7d6bf037"
