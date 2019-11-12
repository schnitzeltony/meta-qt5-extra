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
SRC_URI[md5sum] = "69b66e2a46e453c98bf0251a5c78a0d2"
SRC_URI[sha256sum] = "6ebb7d361a8456e3a3bc7bac995a0224cd76eefd724ff62ba0d6348f7eb1f4f2"

FILES_${PN} += " \
    ${datadir}/icons \
"
