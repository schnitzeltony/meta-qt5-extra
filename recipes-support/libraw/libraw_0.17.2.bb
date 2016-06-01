SUMMARY = "raw image decoder"
LICENSE = "LGPLv2.1 | CDDL-1.0"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=342cc298b1d5db74b6fb703001e5020a"

SRC_URI = "http://www.libraw.org/data/LibRaw-${PV}.tar.gz"
SRC_URI[md5sum] = "456626300777209def1ea784910f326a"
SRC_URI[sha256sum] = "92b0c42c7666eca9307e5e1f97d6fefc196cf0b7ee089e22880259a76fafd15c"
S = "${WORKDIR}/LibRaw-${PV}"

inherit autotools pkgconfig

DEPENDS = "jpeg jasper lcms"
