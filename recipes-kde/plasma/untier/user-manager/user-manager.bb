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
SRC_URI[md5sum] = "b5f5abce69256003a1fe918e0d23986d"
SRC_URI[sha256sum] = "659fab189915140e136c426d6a22852f9685ab85f1fec07a44faaa7a663c8d3d"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
