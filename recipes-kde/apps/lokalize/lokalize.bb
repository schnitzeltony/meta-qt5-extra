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
    ki18n \
    kio \
    kxmlgui \
    knotifications \
    kconfig \
    kcoreaddons \
    kdoctools \
    kross \
    sonnet \
    kdbusaddons \
    kcrash \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "732dc3f1aa601f101bb3f240623238d5"
SRC_URI[sha256sum] = "6cf850add7484235a9079d2424ece17e997c187b9425b4e2f162083915d6b18e"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "translate-toolkit"
