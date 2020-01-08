SUMMARY = "KDE and Plasma resources management GUI"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=6679dc9ea294d0d265902ab8c9936a9c \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gtk-icon-cache

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8f96a68c78c079310f884bae4d908206"
SRC_URI[sha256sum] = "986ef367aef59c5a956d4163f987a60cfd3674a300880376ddedc0222769789f"

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
