SUMMARY = "A KDE Software for Music Education"
LICENSE = "GPLv2 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kcoreaddons-native \
    kdoctools-native \
    qtquickcontrols2 \
    fluidsynth \
    drumstick \
    ki18n \
    kxmlgui \
    kio \
    kcrash \
    kdoctools \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "b9e011ff4957d380da7da8316aa245ad"
SRC_URI[sha256sum] = "76e90ceaa973caa55e99d71976e130a14fd18a1631fcb9644b36259751a30f63"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "timidity++ qtquickcontrols2"
