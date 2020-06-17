SUMMARY = "KDE and Plasma resources management GUI"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6679dc9ea294d0d265902ab8c9936a9c \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gtk-icon-cache mime-xdg

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "83ed1019cfcf0b35b84256505923465e"
SRC_URI[sha256sum] = "a1fa6073bb7d3ce251293c4356af7b15a0af0176fcc9e7032c9feb7b8e09d421"

DEPENDS += " \
    qtdeclarative \
    qtsvg \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    attica \
    kitemmodels \
    knewstuff \
    knotifications \
    kirigami2 \
    plasma-framework \
"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${datadir}/plasma \
    \
    ${libdir}/plasma-discover \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
"

RDEPENDS_${PN} += "python3 kirigami"
