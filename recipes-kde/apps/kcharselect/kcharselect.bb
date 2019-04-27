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
SRC_URI[md5sum] = "67ae65af17b83d080d99c3ee599f1db1"
SRC_URI[sha256sum] = "788e6e97bb53216b4777fb19602d823a8e62f9ea25082f545e970a561fb3a78f"
