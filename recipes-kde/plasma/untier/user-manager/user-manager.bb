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
SRC_URI[md5sum] = "3f31566c772d5bce10c3db7d7b97392e"
SRC_URI[sha256sum] = "977d2df4262b81f7aa405dc306cadde7ad4039590b2f29f31bc904da5b5a59a7"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
