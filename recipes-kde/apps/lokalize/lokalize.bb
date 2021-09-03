SUMMARY = "Computer-aided translation"
LICENSE = "GPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7108e5acd7ce861dee282297d7c2f38c \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += "\
    qtscript \
    hunspell \
	\
    kauth-native \
    ki18n \
    kio \
    kxmlgui \
    knotifications \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    kross \
    sonnet-native \
    kdbusaddons \
    kcrash \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "f3e84ed3e14db0b5e18cfc45871ce5e481bc9555a8513ce6bb32593e73500746"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS:${PN} += "translate-toolkit"
