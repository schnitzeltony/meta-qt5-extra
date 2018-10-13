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
SRC_URI[md5sum] = "63670fe444853c7f2165aec16544af72"
SRC_URI[sha256sum] = "cd4decb9dbe68b19f044c82ab98e640d3b6f83dcd6a474ff2bca654c743a4ac3"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS_${PN} += "timidity++ qtquickcontrols2"
