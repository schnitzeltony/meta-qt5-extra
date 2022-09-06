SUMMARY = "KGeography is a geography learning tool"
LICENSE = "GPL-2.0-only & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kcrash \
    kdbusaddons  \
    kwidgetsaddons  \
    ki18n \
    kconfigwidgets \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "4ab99f43493e5b42b65a8e8ebf5c0b8a5ab1eaea8d653c2a9e65ad59c247373e"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
"
