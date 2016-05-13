SUMMARY = "A KDE Software for Music Education"
LICENSE = "GPLv2 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    drumstick \
    ki18n \
    kxmlgui \
    kio \
    kcrash \
    kdoctools \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "c83bdadb5d1ea3dbd0f4e93087dff987"
SRC_URI[sha256sum] = "05aaef3192203908bcc60c2e2e8e8e89784f31ee9c5d213868dfa23427764583"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"

RDEPENDS_${PN} += "timidity++"
