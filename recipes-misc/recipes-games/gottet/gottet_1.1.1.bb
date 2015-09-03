SUMMARY = "A tetris clone using the Qt GUI toolkit"
HOMEPAGE = "http://gottcode.org/gottet/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "0047e67177609267cf2e781cc031e43a"
SRC_URI[sha256sum] = "c276dba1f7d145d74713fdc92fe2b22cf538ace0115026466109857f7b543163"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/icons \
"
