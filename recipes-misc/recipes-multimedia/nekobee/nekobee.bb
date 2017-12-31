SUMMARY = "A softsynth recreation of a classic single-oscillator bass monosynth"
HOMEPAGE = "https://github.com/gordonjcp/nekobee"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit waf pkgconfig

DEPENDS += " \
    gtk+ \
    ladspa-sdk \
    dssi \
    liblo \
"

SRC_URI = " \
    git://github.com/gordonjcp/${BPN}.git \
    http://linuxsynths.com/NekobeePatchesDemos/NekobeePatches-Nov2317.tar.gz;name=linuxsynths-nekobee-presets;subdir=linuxsynths-nekobee-presets \
"
SRCREV = "593d4be0ff6b4279e1b2b1bacbd5b6b02221358a"
S = "${WORKDIR}/git"
PV = "0.2+git${SRCPV}"

SRC_URI[linuxsynths-nekobee-presets.md5sum] = "007f7bfc3d1b6107ea6459a7c83a8dc7"
SRC_URI[linuxsynths-nekobee-presets.sha256sum] = "f70786dfca41fb516cfe13bd4f1f134c77d4b8ee8d59c59eb70942f2c48450d7"

do_install_append() {
    install -d ${D}/${datadir}/${BPN}/presets
    cp ${WORKDIR}/linuxsynths-nekobee-presets/*.carxs ${D}/${datadir}/${BPN}/presets
}

FILES_${PN} += " \
    ${libdir}/dssi \
"
