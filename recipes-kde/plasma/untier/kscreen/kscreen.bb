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
SRC_URI[md5sum] = "bee9ef8e00b2bbc24a72c4d5cb922fa7"
SRC_URI[sha256sum] = "ae1d0ededb78be624191058a1f0111717a34ed9d3cc565c5fb4cfe9df1e69b98"

FILES_${PN} += " \
    ${datadir}/kcm_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/icons \
    ${libdir}/plugins \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
"
