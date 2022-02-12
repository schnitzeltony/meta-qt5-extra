SUMMARY = "Qalculate library and CLI"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = " \
    intltool-native \
    libxml2 \
    curl \
    icu \
    mpfr \
"

inherit autotools pkgconfig gettext

SRC_URI = "git://github.com/Qalculate/libqalculate.git;branch=master;protocol=https"
SRCREV = "47d9fc13a4732ba40ce391ab76a359fc833014d2"
S = "${WORKDIR}/git"
PV = "3.22.0"

FILES:${PN} += "${datadir}/qalculate"

