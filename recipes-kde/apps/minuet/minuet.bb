SUMMARY = "A KDE Software for Music Education"
LICENSE = "GPLv2 & GFDL-1.3"
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
SRC_URI[md5sum] = "c327c62200db419456cf30a908b3a069"
SRC_URI[sha256sum] = "735b340f9f0d6ee09c2c6aa76061282da6bd921f8b77683c53311731a77edff1"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "timidity++ qtquickcontrols2"
