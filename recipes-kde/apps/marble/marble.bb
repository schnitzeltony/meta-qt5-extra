SUMMARY = "Marble is a Virtual Globe and World Atlas"
LICENSE = "GPL-3.0 & GFDL-1.2 & LGPL-2.0 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL-3;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://LICENSE.txt;md5=e9b5891877660f283be4bc396de0570f \
    file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
"

inherit kde-apps gettext mime-xdg

DEPENDS += " \
    qtsvg \
    qtwebkit \
    \
    kconfig-native \
    kauth-native \
    krunner \
    kservice \
    ki18n \
    kio \
    knewstuff \
    kwallet \
    kparts \
    kcoreaddons-native \
    kparts \
    plasma-framework \
    kdoctools-native \
    sonnet-native \
    kpackage-native \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "fcc7d3bbeed31a43a36db4f2ec94f742ef40edea73ddd0df9dd4fdf4391f0e06"

EXTRA_OECMAKE += " \
    -DMARBLE_PRI_INSTALL_DIR=${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs/modules \
    -DQT_PLUGINS_DIR=${OE_QMAKE_PATH_PLUGINS} \
"

PACKAGES =+ " \
    ${PN}-qt \
    ${PN}-designer-plugin \
"

FILES_SOLIBSDEV = ""

FILES:${PN}-dev += "${libdir}/libastro.so ${libdir}/libmarblewidget-qt5.so"
FILES:${PN}-qt = "${bindir}/${BPN}-qt"

FILES:${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/k* \
    ${datadir}/plasma \
    ${libdir}/libmarbledeclarative.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES:${PN}-designer-plugin += " \
    ${OE_QMAKE_PATH_PLUGINS}/designer \
"
