SUMMARY = "Computer-aided translation"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7108e5acd7ce861dee282297d7c2f38c \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache

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
SRC_URI[md5sum] = "d889cf9793a384f18d294dcee03bf37a"
SRC_URI[sha256sum] = "bb51159c803890af82a38e5a4bd4df0895cc34ed68fa8ed3a4c66adafc9ea6b6"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "translate-toolkit"
