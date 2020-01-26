SUMMARY = "Marble is a Virtual Globe and World Atlas"
LICENSE = "GPLv3 & GFDL-1.2 & LGPLv2 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL-3;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://LICENSE.txt;md5=e9b5891877660f283be4bc396de0570f \
    file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
"

inherit kde-apps cmake_lib gettext mime-xdg

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
SRC_URI[md5sum] = "ae75de8c3e754e90095fbc59513bb41b"
SRC_URI[sha256sum] = "46ec0dcab4773ccfb843ae52881ae833b038a00b7690977a2e721099264dc8dd"

EXTRA_OECMAKE += " \
    -DMARBLE_PRI_INSTALL_DIR=${OE_QMAKE_PATH_QT_ARCHDATA}/mkspecs/modules \
    -DQT_PLUGINS_DIR=${OE_QMAKE_PATH_PLUGINS} \
"

PACKAGES =+ " \
    ${PN}-qt \
    ${PN}-designer-plugin \
"

CMAKE_ALIGN_SYSROOT[1] = "Marble, -S${includedir}, -s${_IMPORT_PREFIX}/include"
CMAKE_ALIGN_SYSROOT[2] = "Astro, -S${includedir}, -s${_IMPORT_PREFIX}/include"

FILES_SOLIBSDEV = ""

FILES_${PN}-dev += "${libdir}/libastro.so ${libdir}/libmarblewidget-qt5.so"
FILES_${PN}-qt = "${bindir}/${BPN}-qt"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/mime \
    ${datadir}/plasma \
    ${libdir}/libmarbledeclarative.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-designer-plugin += " \
    ${OE_QMAKE_PATH_PLUGINS}/designer \
"
