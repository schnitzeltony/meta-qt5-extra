SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "a31d2ba0c628cf40d5102c14930a353c"
SRC_URI[sha256sum] = "08fa8c0f0e5660ae10e9c3291baa6718f0c8b319805a4b8ffe6a71d9e0c8b255"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"
