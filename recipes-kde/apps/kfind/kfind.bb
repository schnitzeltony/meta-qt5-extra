SUMMARY = "KDE file find utility"
LICENSE = "GPLv2 & GFDL-1.3"
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
SRC_URI[md5sum] = "65a0a93eb67fa7d413f0f61d1db6aff9"
SRC_URI[sha256sum] = "25b7b442600c4e109b0a6f7f09962a4d95d419673f6b64eebf226dcdae8cc6ff"

FILES_${PN} += " \
    ${datadir}/icons \
"
