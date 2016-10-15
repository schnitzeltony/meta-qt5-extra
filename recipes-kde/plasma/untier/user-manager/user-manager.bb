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
SRC_URI[md5sum] = "bb6a10a057745fc872664fb927d90b2f"
SRC_URI[sha256sum] = "e7a9d7026e94c1b4c868ab5f3f836a1c564bd30abc2404eb7ca86c7bfd8a8cad"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
