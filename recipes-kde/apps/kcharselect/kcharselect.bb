SUMMARY = "Tool to copy and paste characters from all installed fonts"
LICENSE = "GPL-2.0-only"
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
SRC_URI[sha256sum] = "35e3a75380e335a811fc50ae6fa7e920968655e3aeeffbc12e54d0cc4fb4f3b3"
