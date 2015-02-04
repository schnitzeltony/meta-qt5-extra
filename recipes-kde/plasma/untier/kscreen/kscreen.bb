SUMMARY = "KDE's screen management software"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma

DEPENDS += " \
    qtdeclarative \
    \
    libkscreen \
    kdbusaddons \
    kconfigwidgets \
    ki18n \
    kxmlgui \
    kglobalaccel \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b49bad6be9c178cc7a8c55b77bc63d5a"
SRC_URI[sha256sum] = "a550985616cea384914e6d06752f642d52f2e859fa8551a11a29dafbf53ec725"

FILES_${PN} += " \
    ${datadir}/kcm_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/icons \
    ${libdir}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
"
