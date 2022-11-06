SUMMARY = "A Qt5-based IM client for Matrix"
HOMEPAGE = "https://matrix.org/docs/projects/client/quaternion"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://github.com/quotient-im/Quaternion.git;branch=dev;protocol=https"
SRCREV = "8fb4e9121d569c1c4dbb97ace25951faaed6784a"
PV = "0.0.95.1"
S = "${WORKDIR}/git"

DEPENDS = " \
    qttools-native \
    qttools \
    qtdeclarative \
    qtmultimedia \
    qtquickcontrols2 \
    libquotient \
"
QT_TRANSLATION_FILES = "${datadir}/Quotient/quaternion/translations/*.qm"

inherit cmake_qt5_extra qt5-translation gtk-icon-cache

FILES:${PN} += " \
    ${datadir}/metainfo \
"

