SUMMARY = "A software wavetable MIDI synthesizer"
HOMEPAGE = "http://timidity.sourceforge.net"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

PV = "2.14.0"

UPSTREAM_PN = "TiMidity++"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/timidity/${UPSTREAM_PN}/${UPSTREAM_PN}-${PV}/${UPSTREAM_PN}-${PV}.tar.xz \
    file://0003-timidity-readmidi-zero-division-fix.patch \
    file://0004-timidity-resample-frac-overflow-fix.patch \
"
SRC_URI[md5sum] = "27927182d62ba24abbf447a9e9919c53"
SRC_URI[sha256sum] = "abf0c8367959e85c9e635b8fbd5183fc27bd380e0ef5e45de4158784538c86fc"

S = "${WORKDIR}/${UPSTREAM_PN}-${PV}"
