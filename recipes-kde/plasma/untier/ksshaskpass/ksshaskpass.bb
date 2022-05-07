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
SRC_URI[sha256sum] = "3fe20b23ae5f777d7dd15069212c15826121ce70e5260283d61ad34bad8383cb"
