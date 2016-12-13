SUMMARY = "libdmtx is a library for reading and writing Data Matrix barcodes"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=625f055f41728f84a8d7938acc35bdc2"

inherit autotools pkgconfig

SRC_URI = "git://git.code.sf.net/p/libdmtx/libdmtx;protocol=git"
SRCREV = "eba6d5193fff75efa2707d0c0a5ded9134d2aa58"
PV = "0.7.4"
S = "${WORKDIR}/git"
