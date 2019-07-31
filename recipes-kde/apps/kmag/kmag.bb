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
SRC_URI[md5sum] = "295d9a8b9b0f6014756258e4170910bd"
SRC_URI[sha256sum] = "4fad3d4414884fa8fb7dcfb27e7cc4207dfe219819ffda75355de5c1b4981e35"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
