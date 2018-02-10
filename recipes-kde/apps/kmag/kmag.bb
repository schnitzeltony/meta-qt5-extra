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
SRC_URI[md5sum] = "30e4f09fc51d8f070cf2b1bd77b95290"
SRC_URI[sha256sum] = "a22b8c382f66574f83672aab005ff6aaf9fa110794936f8544a250438b27b07b"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
