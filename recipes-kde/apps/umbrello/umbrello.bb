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
SRC_URI += "file://0001-Use-gcc-buildin-null-pointer-check-to-remove-x86-lim.patch"
SRC_URI[md5sum] = "d4cd9ef531b22ab14b3b6b1f6259ea8e"
SRC_URI[sha256sum] = "2ccd645ab52544885e3b373b0da543ae171d8b41a0bdeb93ae45170f8cd30bb9"

EXTRA_OECMAKE += "-DBUILD_KF5=1"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
"
