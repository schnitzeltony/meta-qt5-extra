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
SRC_URI[md5sum] = "ac28a04ab5cce4b8045aaa2e4d5bf09b"
SRC_URI[sha256sum] = "d4df35ab38dd6906b825e95acf8210a2f6c829e6d81fc59e055abf78df86d0e2"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "translate-toolkit"
