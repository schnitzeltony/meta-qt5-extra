SUMMARY = "raw image decoder"
LICENSE = "LGPLv2.1 | CDDL-1.0"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=da556b13ec78a2eca584c86147e50e61"

SRC_URI = "http://www.libraw.org/data/LibRaw-${PV}.tar.gz"
SRC_URI[md5sum] = "7bd923ea7c9cc71897b005be46c01b2b"
SRC_URI[sha256sum] = "ce366bb38c1144130737eb16e919038937b4dc1ab165179a225d5e847af2abc6"
S = "${WORKDIR}/LibRaw-${PV}"

inherit autotools pkgconfig

DEPENDS = "jpeg jasper lcms"
