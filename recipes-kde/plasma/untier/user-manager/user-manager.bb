SUMMARY = "A simple system settings module to manage the users of your system"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    libpwquality \
    kdelibs4support \
    kcmutils \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "54e6838b85c6336fd57787fb2c970082"
SRC_URI[sha256sum] = "80948463723365292b1c9a5442cde734172b75f9b918429da7f783a2c619e87a"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
