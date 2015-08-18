SUMMARY = "A color matching game"
HOMEPAGE = "http://gottcode.org/hexalate/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "2a5415c115b5ab3d319069ca3ae80c57"
SRC_URI[sha256sum] = "a391ba44aa0f5bd618385dbe17e059947b829b85315aecb19edd1c863b3ebe3c"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/icons \
"
