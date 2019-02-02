SUMMARY = "libdmtx is a library for reading and writing Data Matrix barcodes"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8a135723039c12792b01a2c688251b"

inherit autotools pkgconfig

SRC_URI = "git://github.com/dmtx/libdmtx.git"
SRCREV = "53f001bbcb09f40747d645997f723fc96a58fec2"
PV = "0.7.5"
S = "${WORKDIR}/git"
