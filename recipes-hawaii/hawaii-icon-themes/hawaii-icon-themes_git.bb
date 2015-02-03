SUMMARY = "Icon themes for the Hawaii desktop environment"
LICENSE = "LGPLv2.1 & MIT & GPLv2"
LIC_FILES_CHKSUM = " \
    file://cursors/hawaii/COPYING;md5=2d5025d4aa3495befef8f17206a5b0a1 \
    file://cursors/hawaii/src/adwaita.svg;beginline=6366;endline=6367;md5=b972d4171447cb2b52bc7b6ba883014e \
    file://cursors/hawaii/src/renderpngs.py;beginline=3;endline=8;md5=4476bcd5b2a0f234e52bacaae0f6b37e \
"

inherit cmake

SRCREV = "6a72786dd196d04807bf082f67414cc8a8ebba36"
PV = "0.3.0+git${SRCPV}"
S = "${WORKDIR}/git"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git;protocol=git;branch=stable"

PACKAGE_ARCH = "all"

FILES_${PN} += "${datadir}/icons"
