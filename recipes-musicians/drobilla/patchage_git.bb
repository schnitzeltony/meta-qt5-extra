SUMMARY = "Patchage is a modular patch bay for audio and MIDI systems"
DESCRIPTION = "Patchage is a modular patch bay for audio and MIDI systems based on Jack and Alsa"
HOMEPAGE = "http://drobilla.net/software/patchage"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit waf gtk-icon-cache pkgconfig

DEPENDS += " \
    boost \
    jack \
    ganv \
"

SRC_URI = " \
     git://git.drobilla.net/patchage.git;protocol=http \
     file://0001-Do-not-inject-usr-local-include-to-include-paths.patch \
"
SRCREV = "b69a38d171758c6e979d74541fc21d12b7e6abda"
PV = "1.0.0+git${SRCPV}"
S = "${WORKDIR}/git"
