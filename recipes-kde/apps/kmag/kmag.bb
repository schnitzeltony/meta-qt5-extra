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
SRC_URI[sha256sum] = "b9a16003d5a6b2a57bef178fdb3eec955dd76825e7519ed83c882459aa0d813a"

FILES:${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
