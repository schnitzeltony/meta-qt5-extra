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
SRC_URI[md5sum] = "39ef66c692de48bdb2f75240cb0ff456"
SRC_URI[sha256sum] = "3fcd234b2d01588b2bbd34cc61c6a1ac1ea5cbb03bed1aef971da415d1169ef2"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
