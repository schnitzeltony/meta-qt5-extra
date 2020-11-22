SUMMARY = "Property editing framework with editor widget"
HOMEPAGE = "https://community.kde.org/KProperty"
LICENSE = "LGPL-2.0 & GFDL-1.2 & BSD-3-Clause"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=3dcc9b0b0118292a0c5d1c18927ef176 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps

DEPENDS += " \
    kcoreaddons-native \
    kcoreaddons \
    kconfig-native \
    kconfig \
    kwidgetsaddons \
    kguiaddons \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/src/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "67af0c2d74715957bd5373a6a30589ff0a996cb1d267dfd0538dccaa9a768dfa"

FILES_${PN} += " \
    ${datadir}/kproperty3 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
