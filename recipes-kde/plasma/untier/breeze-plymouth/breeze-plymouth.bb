SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "2f48a4f199780cc8fe3d31eda54034e7"
SRC_URI[sha256sum] = "674090b5776aca915b58cfbeada45895fc51bac0e2d31509628277a2fd24c538"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"
