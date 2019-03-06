SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c1f4e6f89d9d01ab3b4337ffc9441fd7"
SRC_URI[sha256sum] = "f093566ae51218b4461d1dbebb7a8ee402077bda2e67d840dc71309926c9d758"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"
