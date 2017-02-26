SUMMARY = "Patchage is a modular patch bay for audio and MIDI systems"
DESCRIPTION = "Patchage is a modular patch bay for audio and MIDI systems based on Jack and Alsa"
HOMEPAGE = "http://drobilla.net/software/patchage"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit waf gtk-icon-cache

DEPENDS += " \
    jack \
    ganv \
"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "d16a3fc045faff7fd70f3b4769b65698"
SRC_URI[sha256sum] = "6b21d74ef1b54fa62be8d6ba65ca8b61c7b6b5230cc85e093527081239bfeda9"

FILES_${PN} += " \
    ${datadir}/icons \
"
