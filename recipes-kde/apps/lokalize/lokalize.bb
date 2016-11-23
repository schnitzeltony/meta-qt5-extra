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
SRC_URI[md5sum] = "5795f0e21a6ee1b3b4e4fce5e7c15e33"
SRC_URI[sha256sum] = "15394fca4443ba6b8841a6626efddee8e5809cbef8b590b5814e2e50ffcd636e"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "translate-toolkit"
