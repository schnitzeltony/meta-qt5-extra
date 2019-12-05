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
SRC_URI[md5sum] = "5a0bd5e1647b772bd261ef522c5e95cd"
SRC_URI[sha256sum] = "1e8021ffeba4eb146c9bc1bf12f0d563d5c0da1bf75d0d63779b1f98b02c0be4"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
