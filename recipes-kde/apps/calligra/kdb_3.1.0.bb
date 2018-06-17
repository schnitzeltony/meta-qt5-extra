SUMMARY = "Database Connectivity and Creation Framework"
HOMEPAGE = "https://community.kde.org/KDb"
LICENSE = "LGPLv2 & GFDL-1.2 & BSD"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=a9cc0417b6424a8311f616fa527d0755 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps

DEPENDS += " \
    icu \
    kcoreaddons-native \
    kcoreaddons \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "25651209050396a76d660856f109cf04"
SRC_URI[sha256sum] = "175645a149ae4d758ff2746900f6eabe4734b2bdac4d8c95893c650be4f929f2"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
