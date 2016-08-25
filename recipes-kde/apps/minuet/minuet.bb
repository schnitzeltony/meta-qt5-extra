SUMMARY = "A KDE Software for Music Education"
LICENSE = "GPLv2 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    fluidsynth \
    drumstick \
    ki18n \
    kxmlgui \
    kio \
    kcrash \
    kdoctools \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "0e714f8ab026d7580000c5d6e332a086"
SRC_URI[sha256sum] = "a02466662750768339cbd30154dcea39c8483d8cdca4c42be785de19e72f061e"
SRC_URI += "file://0001-reduce-minimim-version-of-Qt-to-5.6.1.patch"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"

RDEPENDS_${PN} += "timidity++ qtquickcontrols2-qmlplugins"
