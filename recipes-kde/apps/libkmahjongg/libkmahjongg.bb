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
SRC_URI[md5sum] = "5bbdad8b4e39f7f52ce90cf51f159932"
SRC_URI[sha256sum] = "995f10fc62c506dbbb31bdab635fd52cb08e03eb09c859353aaf3423f48c7381"

FILES_${PN} += " \
    ${datadir}/kmahjongglib \
"
