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
SRC_URI[md5sum] = "b48b84375adfe45c9a51b08c7f097aa7"
SRC_URI[sha256sum] = "6d680217058b8d87306c298d28e0851d7d0bb88450c59935eb4d1f6c87ba92a7"
