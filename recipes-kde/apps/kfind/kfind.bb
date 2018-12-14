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
SRC_URI[md5sum] = "64f9ff65142a26a657ad8c9f03b29416"
SRC_URI[sha256sum] = "f3bfc2fc34420d282e6e54e92cfc02d10211e674fc0eaafbc2d6277e1172a24e"

FILES_${PN} += " \
    ${datadir}/icons \
"
