SUMMARY = "KMag is a screen magnifier"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=38adfe5a9f2953129da1774430b28adf \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kdoctools \
    ki18n \
    kio \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "5dc45c0599537cbb6bef30be08197c55"
SRC_URI[sha256sum] = "c33ee1355ff9222136f04a9645d7f02199506104173db7720fe1df449bcec9f8"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
