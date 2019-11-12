SUMMARY = "GUI for diagramming Unified Modelling Language (UML)"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    kcoreaddons-native \
    kdoctools-native \
    kconfig-native \
    sonnet-native \
    kdelibs4support-native \
    kdesignerplugin-native \
    \
    qtsvg \
    qtwebkit \
    \
    karchive \
    kauth-native \
    kcompletion \
    ki18n \
    kiconthemes \
    kio \
    ktexteditor \
    kwidgetsaddons \
    kxmlgui \
    kdelibs4support \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "51ec4a59b84893af13f0586d603a266b"
SRC_URI[sha256sum] = "c4c56354d2765c0d03ffda02cc098cc3e9d72b0c7c22bb0c1cc03dcf5ac31a6a"

EXTRA_OECMAKE += "-DBUILD_KF5=1"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/umbrello5 \
"
