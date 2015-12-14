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
SRC_URI[md5sum] = "91d261e85aa95f22f35b01dd67433b19"
SRC_URI[sha256sum] = "a6b3074461435b1303b669d6355c1c1a82cff4e15194b3b0dbc5fcb468baf657"

FILES_${PN} += " \
    ${datadir}/kcm_kscreen \
    ${datadir}/kservices5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
