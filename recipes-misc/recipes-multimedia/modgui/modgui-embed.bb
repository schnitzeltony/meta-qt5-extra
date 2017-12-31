SUMMARY = "MODGUIs as regular, embeddable LV2 UIs"
HOMEPAGE = "http://distrho.sourceforge.net/ports"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://modgui-x11ui.lv2/modgui-x11;beginline=4;endline=17;md5=641a06ff4188f4a77fa2d4927a5ec9eb \
"

# Important notice:
# This recipe builds but won't work: I RDEPENDS on pyqt4 build with webkit

SRC_URI = " \
    git://github.com/moddevices/modgui-embed.git \
    file://0001-Remove-x86-specific-build-flags.patch \
"

SRCREV = "469ec4916c4b75615bfed69ea63a7d1f26296ba0"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

REQUIRED_DISTRO_FEATURES = "x11"

inherit qemu-ext distro_features_check

DEPENDS += " \
    lv2 \
"

do_install() {
    install -d ${D}${libdir}/lv2
	cp -r ${S}/modgui-x11ui.lv2 ${D}${libdir}/lv2/
}

FILES_${PN} += " \
    ${libdir}/lv2 \
"

