SUMMARY = "Scribus: Open source desktop publishing"
HOMEPAGE = "https://www.scribus.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5d1d7a95f43e1139c1c42c7414852679"

inherit cmake_qt5 cmake_extra_sanity

DEPENDS += " \
    cairo \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}-devel/${PV}/${BPN}-${PV}.tar.xz \
"
SRC_URI[md5sum] = "031661a8fe0ba0131c360d3e9edc2fc0"
SRC_URI[sha256sum] = "ec5eec23aeda655d3a761cffb85853dcd2ede3973b9e62a1b3c28bd1093c74f5"
