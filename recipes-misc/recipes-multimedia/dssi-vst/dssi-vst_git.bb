SUMMARY = "DSSI plugin wrapper for VST plugins"
HOMEPAGE = "http://breakfastquay.com/dssi-vst/"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=3523f03012c30f3347df42d632e5762c"

inherit pkgconfig

DEPENDS += " \
    dssi \
    ladspa-sdk \
    alsa-lib \
    jack \
    liblo \
    zlib \
"

SRC_URI = "git://github.com/falkTX/dssi-vst.git"
SRCREV = "9462b34563af84b452795d4924d4f18af9072529"
S = "${WORKDIR}/git"
PV = "0.9.2+git${SRCPV}"

EXTRA_OEMAKE = 'BUILD_FLAGS="-ffast-math -fPIC -Ivestige ${CXX_FLAGS}" TARGETS="dssi-vst.so dssi-vst_gui vsthost"'

do_install() {
    # Makefile wants to install wine binaries - so install manually
    install -d ${D}${bindir}
    install -d ${D}${libdir}/dssi/dssi-vst
    install -d ${D}${libdir}/ladspa
    install -m 755 vsthost ${D}${bindir}
    install -m 755 ${S}/dssi-vst.so ${D}${libdir}/dssi
    # install once only
    ln -s ../dssi/dssi-vst.so ${D}${libdir}/ladspa
    install -m 755 ${S}/dssi-vst_gui ${D}${libdir}/dssi/dssi-vst
}

INSANE_SKIP_${PN} = "dev-so"

FILES_${PN} += " \
    ${libdir}/ladspa \
    ${libdir}/dssi \
"
