SUMMARY = "GUI for diagramming Unified Modelling Language (UML)"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qtsvg \
    qtwebkit \
    \
    karchive \
    kauth-native \
    kcompletion \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    sonnet-native \
    ki18n \
    kiconthemes \
    kio \
    ktexteditor \
    kwidgetsaddons \
    kxmlgui \
    kdelibs4support \
    kdelibs4support-native \
    kdesignerplugin \
    kdesignerplugin-native \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "38a996248578df54efdeaa2b7944230f"
SRC_URI[sha256sum] = "adace35eb1e8e1e4f8521fb57661d0d61888e3065322bf40e81b960077b3243e"

EXTRA_OECMAKE += "-DBUILD_KF5=1"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/umbrello5 \
"
