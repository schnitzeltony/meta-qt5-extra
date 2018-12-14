SUMMARY = "Common code, backgrounds and tile sets for Mahjongg games"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qtsvg \
    kauth-native \
    kcoreaddons-native \
    kconfig-native \
    kconfigwidgets \
    kwidgetsaddons  \
    kcompletion  \
    ki18n \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "73524f4ed1fb475e1f681a962e3bb776"
SRC_URI[sha256sum] = "fd11f7dac545b2a294298ee3a2f237c71018c46717dac63983116d36218af38a"

FILES_${PN} += " \
    ${datadir}/kmahjongglib \
"
