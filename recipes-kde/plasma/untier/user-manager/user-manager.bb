SUMMARY = "A simple system settings module to manage the users of your system"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-plasma

DEPENDS += " \
    libpwquality \
    kdelibs4support \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "99c9e12c5e5a84041e1bd1729e420111"
SRC_URI[sha256sum] = "95710e43fbe841abe518fae49f7c9a122bbd372d27947ee4343521e05d0f82ec"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
