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
SRC_URI[md5sum] = "a9546cd36e567999c883d0620e9ae9c2"
SRC_URI[sha256sum] = "0f6198a4318703a4ce5ee3c13df3c4b80d2b8f7a79a7d4c4a6b405dab3a0d94b"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${datadir}/appdata \
"

RDEPENDS_${PN} += "timidity++"
