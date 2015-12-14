SUMMARY = "Plasma Media Center"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma pkgconfig gtk-icon-cache

DEPENDS += " \
    qtmultimedia \
    \
    kcoreaddons \
    kconfig \
    ki18n \
    kguiaddons \
    kservice \
    kio \
    kdeclarative \
    kactivities \
    kfilemetadata \
    plasma-framework \
    baloo \
    \
    taglib \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c6cadaf7ca6510498afdb8afec7464da"
SRC_URI[sha256sum] = "a2e01a6f1117848959d609e97225689764e7f38d3a0365b8e57bb85c875e5982"
SRC_URI += "file://0001-use-pkgconfig-to-find-taglib.patch"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${datadir}/xsessions \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_PLUGINS}/plasma/mediacenter/*/*.so \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/mediacenter \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/plasma/mediacenter/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/plasma/mediacenter/.debug \
"

