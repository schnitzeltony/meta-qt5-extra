SUMMARY = "libdmtx is a library for reading and writing Data Matrix barcodes"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8a135723039c12792b01a2c688251b"

inherit autotools pkgconfig

SRC_URI = "git://git.code.sf.net/p/libdmtx/libdmtx;protocol=git"
SRCREV = "eba6d5193fff75efa2707d0c0a5ded9134d2aa58"
PV = "0.7.4"
S = "${WORKDIR}/git"
