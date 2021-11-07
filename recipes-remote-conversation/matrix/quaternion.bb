SUMMARY = "A Qt5-based IM client for Matrix"
HOMEPAGE = "https://matrix.org/docs/projects/client/quaternion"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/quotient-im/Quaternion.git;branch=master;protocol=https"
SRCREV = "307116615d7ca0e08b2468f161531f3e21d24ae8"
PV = "0.0.9.4e"
S = "${WORKDIR}/git"

DEPENDS = " \
    qttools-native \
    qttools \
    qtdeclarative \
    qtmultimedia \
    libquotient \
"
QT_TRANSLATION_FILES = "${datadir}/Quotient/quaternion/translations/*.qm"

inherit cmake_qt5_extra qt5-translation gtk-icon-cache

FILES:${PN} += " \
    ${datadir}/metainfo \
"

