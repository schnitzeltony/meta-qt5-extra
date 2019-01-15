SUMMARY = "LV2 plugins to filter midi events"
HOMEPAGE = "http://x42.github.io/midifilter.lv2/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit autotools-brokensep pkgconfig

DEPENDS += "lv2"

SRC_URI = " \
    git://github.com/x42/midifilter.lv2.git \
    file://0001-keysplit-Forward-CCs-to-both-target-channels.patch \
"
SRCREV = "7b9956266616d681fa21b9924d606fa7479e55bd"
PV = "0.5.1"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    STRIP=echo \
"

FILES_${PN} += "${libdir}/lv2"
