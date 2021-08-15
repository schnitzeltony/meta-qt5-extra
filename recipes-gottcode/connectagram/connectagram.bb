SUMMARY = "Connectagram is a word unscrambling game"
HOMEPAGE = "https://gottcode.org/connectagram/"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit qmake5 qt5-translation gtk-icon-cache

DEPENDS = "qttools-native qtbase hicolor-icon-theme"

SRC_URI = "http://gottcode.org/${BPN}/${BPN}-${PV}-src.tar.bz2"
SRC_URI[md5sum] = "6ec03e98a79b8404a414353a3538aec7"
SRC_URI[sha256sum] = "a711da70bd08383dd06b5f7ccbd92dcd201165426dfd20343c64f584a23f9de1"
PV = "1.2.11"
UPSTREAM_CHECK_REGEX = "${BPN}-(?P<pver>\d+(\.\d+)+)\-src\.tar"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"

FILES:${PN} += " \
    ${datadir}/metainfo \
"

# WIP: qt5-translation expects *.qm to work properly so pack word data in PN for now
FILES:${PN} += " \
    ${datadir}/connectagram/data \
"
