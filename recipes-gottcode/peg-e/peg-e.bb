SUMMARY = "Peg-E is a peg solitaire game"
HOMEPAGE = "http://gottcode.org/peg-e/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "ea2659e5cf6e0d981189cbe2751588df"
SRC_URI[sha256sum] = "06d6a07c056b82372cdd6ac258dbfedab397ad4f13b70117f548b8218201ff17"
PV = "1.2.8"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${datadir}/peg-e/icons \
"
