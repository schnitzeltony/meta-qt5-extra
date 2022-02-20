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
SRC_URI[sha256sum] = "308020a321423cba3339b914bc50eef34a56fb0d6736675cb237d2417fbf0181"
