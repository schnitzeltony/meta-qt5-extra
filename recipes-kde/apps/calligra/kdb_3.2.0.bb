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

SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/src/${BPN}-${PV}.tar.xz \
    file://0001-Do-not-rely-on-python2.patch \
"
SRC_URI[md5sum] = "78f66c9b8f9d1e61d421eea7ce5241c7"
SRC_URI[sha256sum] = "8f8983bc8d143832dc14bc2003ba6af1af27688e477c0c791fd61445464f2069"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
