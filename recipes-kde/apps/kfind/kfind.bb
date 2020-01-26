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
SRC_URI[md5sum] = "4b4e0421497b1a235c7eab6a8a09533d"
SRC_URI[sha256sum] = "e9f5defa7796bbb54208b28af1fa76333a38e743d7febb8dd14739cf00d376eb"

FILES_${PN} += " \
    ${datadir}/icons \
"
