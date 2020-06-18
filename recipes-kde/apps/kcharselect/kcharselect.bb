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
SRC_URI[md5sum] = "2112a43ef704702ebc55f92add1e31be"
SRC_URI[sha256sum] = "50fff8cfa3dea3f51312b1c3d629d633a66f6cb6c1ca62bdd26f1f5a72f00de2"
