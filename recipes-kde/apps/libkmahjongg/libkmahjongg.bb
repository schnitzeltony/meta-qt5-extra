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
SRC_URI[md5sum] = "f6e9f8a824b7bfc640d753c0fe8b87b7"
SRC_URI[sha256sum] = "56e94db922f2b0613721e6ce52ba6dc1825d4a212613b1ff78daed6b9ca95989"

FILES_${PN} += " \
    ${datadir}/kmahjongglib \
"
