SUMMARY = "A KDE Software for Music Education"
LICENSE = "GPL-2.0 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.DOC;md5=10ce6fc3438e5c4c933bfb5db3b097ec \
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
SRC_URI[sha256sum] = "27315b7376428683c8f94e79d7b08c67c8b3609e17dc354cf0ee907700ba5836"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "timidity++ qtquickcontrols2"
