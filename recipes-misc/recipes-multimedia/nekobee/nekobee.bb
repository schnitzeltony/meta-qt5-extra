SUMMARY = "A softsynth recreation of a classic single-oscillator bass monosynth"
HOMEPAGE = "https://github.com/gordonjcp/nekobee"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit wafold pkgconfig

DEPENDS += " \
    gtk+ \
    ladspa-sdk \
    dssi \
    liblo \
"

SRC_URI = "git://github.com/gordonjcp/${BPN}.git"
SRCREV = "593d4be0ff6b4279e1b2b1bacbd5b6b02221358a"
S = "${WORKDIR}/git"
PV = "0.2+git${SRCPV}"

FILES_${PN} += " \
    ${libdir}/dssi \
"
