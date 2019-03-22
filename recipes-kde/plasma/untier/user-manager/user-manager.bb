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
SRC_URI[md5sum] = "c1b015e2c94995c1e336204900d77929"
SRC_URI[sha256sum] = "444b9a69f3347caa81ab1c1baaabb135a9cae783c1e91cc7e40c3626fb784ca1"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
