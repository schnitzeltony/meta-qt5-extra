SUMMARY = "Digital Peak Limiter LV2 Plugin"
HOMEPAGE = "https://x42-plugins.com/x42/x42-limiter"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=9eef91148a9b14ec7f9df333daebc746"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    libglu \
    cairo \
    pango \
    lv2 \
    jack \
"

SRC_URI = "gitsm://github.com/x42/dpl.lv2.git"
SRCREV = "960f87c51ce3243dadeeedc16bb48608da462ed4"
PV = "0.2.2+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OEMAKE += " \
    PREFIX=${prefix} \
    LV2DIR=${libdir}/lv2 \
    STRIP=echo \
    OPTIMIZATIONS= \
"

FILES_${PN} += "${libdir}/lv2"
