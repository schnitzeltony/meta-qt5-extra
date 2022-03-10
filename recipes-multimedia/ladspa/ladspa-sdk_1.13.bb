SUMMARY = "Linux Audio Developer's Simple Plug-in API, examples and tools"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://doc/COPYING;md5=6fd75d9d2ba6776dcdc4d5257eeab3dd"

DEPENDS += " \
    fftw \
"

SRC_URI = " \
    http://slackware.uk/slacky/slackware-13.0/multimedia/ladspa/${PV}/src/ladspa_sdk_${PV}.tgz \
    file://0001-do-not-pin-build-flags-use-defaults.patch \
    file://0002-Fix-_init-and-_fini-multiple-definition.patch \
    file://0002-Use-fallback-for-plugindir-in-case-env.-var-LADSPA_P.patch \
"
SRC_URI[md5sum] = "671be3e1021d0722cadc7fb27054628e"
SRC_URI[sha256sum] = "b5ed3f4f253a0f6c1b7a1f4b8cf62376ca9f51d999650dd822650c43852d306b"

S = "${WORKDIR}/ladspa_sdk"

CFLAGS += "-I. -fPIC"
CXXFLAGS += "-I. -fPIC"

do_compile() {
    cd ${S}/src
    oe_runmake targets
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/bin/* ${D}${bindir}

    install -d ${D}${libdir}/ladspa
    install -m 0644 ${S}/plugins/* ${D}${libdir}/ladspa

    install -d ${D}${includedir}
    install -m 0644 ${S}/src/ladspa.h ${D}${includedir}
}

FILES:${PN} += "${libdir}/ladspa"
