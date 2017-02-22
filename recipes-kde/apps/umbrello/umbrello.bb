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
SRC_URI[md5sum] = "8220dee29d3b970579297c284b1c3916"
SRC_URI[sha256sum] = "dfd079eb57ea4429016276d721190f942aeb9d4e155b83e6a87f27b9ab2988bc"

EXTRA_OECMAKE += "-DBUILD_KF5=1"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
"
