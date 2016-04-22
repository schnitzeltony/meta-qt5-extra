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
SRC_URI[md5sum] = "50b2ca7a1c8c2fa0e5fc39312504ef2f"
SRC_URI[sha256sum] = "b19471e073c07194270d56f930be91f64ed3c4bfb9b2d702eccbf6267cbde7e4"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "translate-toolkit"
