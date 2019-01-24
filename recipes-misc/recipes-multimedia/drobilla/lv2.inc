SUMMARY = "LV2 is an open standard for audio plugins"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRC_URI = " \
    git://github.com/drobilla/lv2.git \
    file://0001-Output-more-details-on-import-error-to-catch-missing.patch \
"
S = "${WORKDIR}/git"
SRCREV = "96a6283a5fe023c59113242631f337da5f0eb278"
PV = "1.14.0+git${SRCPV}"

inherit waf pkgconfig
