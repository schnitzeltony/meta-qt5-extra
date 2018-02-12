SUMMARY = "LV2 plugins to filter midi events"
HOMEPAGE = "http://x42.github.io/midifilter.lv2/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit autotools-brokensep pkgconfig

DEPENDS += "lv2"

SRC_URI = "git://github.com/x42/midifilter.lv2.git"
SRCREV = "5b2b0976b1cbdb7533bea23d1fcac45e21803edd"
PV = "0.4.7+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    STRIP=echo \
"

FILES_${PN} += "${libdir}/lv2"
