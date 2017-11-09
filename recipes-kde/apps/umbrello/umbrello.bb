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
SRC_URI[md5sum] = "7d9cab3145d087e52ad76fcac395c605"
SRC_URI[sha256sum] = "e0c8845e03c251c9e8b33f9d3e09d312c5e8f6b8200f84f5d3610970a74d24bc"

EXTRA_OECMAKE += "-DBUILD_KF5=1"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/umbrello5 \
"
