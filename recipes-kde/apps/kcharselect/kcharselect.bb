SUMMARY = "Tool to copy and paste characters from all installed fonts"
LICENSE = "GPL-2.0"
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
SRC_URI[sha256sum] = "83a1a8b0850d4b3c335f1b76a553ff490365928cf34e38963e941fe82933e9e3"
