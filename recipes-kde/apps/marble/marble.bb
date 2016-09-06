SUMMARY = "Marble is a Virtual Globe and World Atlas"
LICENSE = "GPLv3 & GFDL-1.2 & LGPLv2 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL-3;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://LICENSE.txt;md5=e9b5891877660f283be4bc396de0570f \
    file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps cmake_lib

DEPENDS += " \
    qtsvg \
    qtwebkit \
    \
    kconfig \
    krunner \
    kservice \
    ki18n \
    kio \
    knewstuff \
    kwallet \
    kparts \
    kcoreaddons \
    kparts \
    plasma-framework \
    kdoctools \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "6e2a88dc46331ce1200dfc341a598506"
SRC_URI[sha256sum] = "ce309c827f60f389a012fb8ea8ccccf5d5925e0c5de8ae41f2ac981c1fe1c5a8"
SRC_URI += "file://0001-align-path-of-designer-plugins.patch"

PACKAGES =+ " \
    ${PN}-mobile ${PN}-qt ${PN}-touch \
    ${PN}-designer-plugin-dbg ${PN}-designer-plugin \
"

CMAKE_ALIGN_SYSROOT[1] = "Marble, -S${includedir}, -s${_IMPORT_PREFIX}/include"
CMAKE_ALIGN_SYSROOT[2] = "Astro, -S${includedir}, -s${_IMPORT_PREFIX}/include"

FILES_SOLIBSDEV = ""

FILES_${PN}-dev += "${libdir}/libastro.so ${libdir}/libmarblewidget-qt5.so"
FILES_${PN}-mobile = "${bindir}/${BPN}-mobile"
FILES_${PN}-qt = "${bindir}/${BPN}-qt"
FILES_${PN}-touch = "${bindir}/${BPN}-touch"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/mime \
    ${libdir}/libmarbledeclarative.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${libdir}/marble/plugins/.debug \
    ${libdir}/marble/plugins/org/kde/edu/marble/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"

FILES_${PN}-designer-plugin += " \
    ${OE_QMAKE_PATH_PLUGINS}/designer \
"

FILES_${PN}-designer-plugin-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/designer/.debug \
"
