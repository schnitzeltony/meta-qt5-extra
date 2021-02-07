SUMMARY = "KDE file find utility"
LICENSE = "GPL-2.0 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
"

inherit kde-apps gettext gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    karchive \
    kfilemetadata \
    ki18n \
    kio \
    ktextwidgets \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "cb329fa0aefc42afe1176e646e506ac566efa7e134ae173e690733cb6f2cd16d"

FILES_${PN} += " \
    ${datadir}/icons \
"
