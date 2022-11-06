SUMMARY = "A software wavetable MIDI synthesizer"
HOMEPAGE = "http://timidity.sourceforge.net"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

PV = "2.15.0"

UPSTREAM_PN = "TiMidity++"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/timidity/${UPSTREAM_PN}/${UPSTREAM_PN}-${PV}/${UPSTREAM_PN}-${PV}.tar.xz \
    file://0003-timidity-readmidi-zero-division-fix.patch \
    file://0004-timidity-resample-frac-overflow-fix.patch \
"
SRC_URI[sha256sum] = "9eaf4fadb0e19eb8e35cd4ac16142d604c589e43d0e8798237333697e6381d39"

S = "${WORKDIR}/${UPSTREAM_PN}-${PV}"
