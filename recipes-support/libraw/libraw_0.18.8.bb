SUMMARY = "raw image decoder"
LICENSE = "LGPLv2.1 | CDDL-1.0"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=da556b13ec78a2eca584c86147e50e61"

SRC_URI = "http://www.libraw.org/data/LibRaw-${PV}.tar.gz"
SRC_URI[md5sum] = "ef5b9bc4c2749b83f63c6c38a5f5d744"
SRC_URI[sha256sum] = "56aca4fd97038923d57d2d17d90aa11d827f1f3d3f1d97e9f5a0d52ff87420e2"
S = "${WORKDIR}/LibRaw-${PV}"

inherit autotools pkgconfig

DEPENDS = "jpeg jasper lcms"
