SUMMARY = "Ingen is a modular audio processing system for Jack and LV2 based systems"
HOMEPAGE = "http://drobilla.net/software/ingen"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

inherit waf pkgconfig gtk-icon-cache pack_audio_plugins pythonnative

DEPENDS += " \
    boost \
    gtkmm \
    lilv \
    suil \
    raul \
    ganv \
    portaudio-v19 \
"

SRC_URI = " \
    git://github.com/drobilla/ingen.git \
    file://0001-Do-not-inject-usr-local-include-to-include-paths.patch \
"
SRCREV = "cc3d7ef610e5f93086eb46406cc600ee81a23e98"
S = "${WORKDIR}/git"
PV = "0.5.1+git${SRCPV}"

DOCDEPENDS = " \
    lv2-native \
    doxygen-native \
    graphviz-native \
    gdk-pixbuf-native \
    libpng-native \
    python-rdflib-native \
    python-isodate-native \
    python-six-native \
"
PACKAGECONFIG[doc] = "--docs,,${DOCDEPENDS}"

PACKAGES =+ "${PN}-standalone ${PN}-python"

FILES_SOLIBSDEV = "${libdir}/libingen${SOLIBSDEV}"

FILES_${PN} += " \
    ${libdir}/libingen_*.so \
"

FILES_${PN}-standalone = " \
    ${datadir}/applications \
    ${datadir}/icons \
    ${bindir}/ingen \
"

# pyton tools are not expected to work: we do not have rdflib yet
FILES_${PN}-python = " \
    ${bindir}/ingenams \
    ${bindir}/ingenish \
    ${PYTHON_SITEPACKAGES_DIR} \
"
