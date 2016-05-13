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
SRC_URI[md5sum] = "5cdab4f8e0aa691d6683188846e88d61"
SRC_URI[sha256sum] = "40bfa9d39ee4216de4304b5bd5c64b36b191b0f0e905c1df6e3ff4db725650c0"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "translate-toolkit"
