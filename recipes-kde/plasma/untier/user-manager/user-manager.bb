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
SRC_URI[md5sum] = "55f8fbdeb4e1aa544fdd9e5194db2af4"
SRC_URI[sha256sum] = "e64df8a6ba87d1527bd45e912183039f24b4151f929a7f019243f9175344cf7f"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
