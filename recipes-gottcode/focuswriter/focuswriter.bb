SUMMARY = "FocusWriter is a simple, distraction-free writing environment"
HOMEPAGE = "http://gottcode.org/gottet/"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache mime-xdg

DEPENDS += " \
    qttools-native \
    qtbase \
    qtmultimedia \
    hicolor-icon-theme \
    hunspell \
"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "ba9e316b4bc0c4568d71f7dc3cd64fff"
SRC_URI[sha256sum] = "34f576a49c9fe64aedad66e02efafc29c840b6c3ddc98a42d87dfda499710541"
PV = "1.7.6"
UPSTREAM_CHECK_REGEX = "${BPN}-(?P<pver>\d+(\.\d+)+)\-src\.tar"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES:${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/${BPN}/icons \
    ${datadir}/${BPN}/symbols1000.dat \
    ${datadir}/${BPN}/themes \
    ${datadir}/${BPN}/sounds \
"
