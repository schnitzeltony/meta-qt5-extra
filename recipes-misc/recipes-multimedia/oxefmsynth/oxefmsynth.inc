SUMMARY = "Oxe FM Synth is an open source VST 2.4 instrument plugin"
HOMEPAGE = "http://www.oxesoft.com/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

inherit distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI = " \
    git://github.com/oxesoft/oxefmsynth.git \
    file://0001-Makefile.vstlinux-Drop-32-64-quirks.patch \
"
SRCREV = "516dc54d34dd6e7ed65a52c899b7acb1f7631225"
PV = "1.3.5+git${SRCPV}"
S = "${WORKDIR}/git"
