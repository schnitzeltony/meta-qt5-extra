SUMMARY = "KMag is a screen magnifier"
LICENSE = "GPL-2.0-only & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=38adfe5a9f2953129da1774430b28adf \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
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
SRC_URI[sha256sum] = "e65aaaa3e480c215384bae721afb36d7e50a7f8ab27aa4013eb46de1f43d97af"

FILES:${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
