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
    \
    karchive \
    kcompletion \
    kconfig \
    kcoreaddons \
    kdoctools \
    ki18n \
    kiconthemes \
    kio \
    ktexteditor \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "b4180a6f3d41748a04685d4105f338b1"
SRC_URI[sha256sum] = "e2c5abd94a9c82cbb28939821395195be859a601df5d09096d4fecf4d6516785"

EXTRA_OECMAKE += "-DBUILD_KF5=1"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/appdata \
"
