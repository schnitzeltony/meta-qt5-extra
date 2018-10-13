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
SRC_URI[md5sum] = "88f25b30560f8fe47eec4d940bff4bb6"
SRC_URI[sha256sum] = "67bfdbaf1ff63624e15ef2394604e608c1dab2670f4255daf09e4bfca2ae70b0"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
