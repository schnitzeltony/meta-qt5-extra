SUMMARY = "Breeze theme for Plymouth"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "plymouth"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "ba767671eb7741405215f9a7e4b05ea5"
SRC_URI[sha256sum] = "92143ae63aaa02189350cbfa885215cfbb8f0ab85a02b2de0159ac7fbad50784"

FILES_${PN} += " \
    ${datadir}/plymouth \
    ${libdir}/plymouth \
"
