SUMMARY = "Tool to copy and paste characters from all installed fonts"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-apps

DEPENDS += " \
    kdoctools-native \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kbookmarks \
    kcrash \
    ki18n \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "36575e9fd0a93fb3ddaf6a75a213786351bdd3ab8c167dc1a3e2824a23a6655b"
