SUMMARY = "Wolf Shaper is a waveshaper plugin with a graph editor"
HOMEPAGE = "https://pdesaulniers.github.io/wolf-shaper/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fe869ee987a340198fb0d54c55c47f1"

DEPENDS = " \
    jack \
    dssi \
    lv2 \
"

inherit autotools-brokensep pkgconfig lv2-postinst-helper

SRC_URI = "gitsm://github.com/pdesaulniers/wolf-shaper.git"
SRCREV = "adc67b3f923917b6b42f545451e6d4932f721e97"
S = "${WORKDIR}/git"

export PREFIX="${prefix}"

do_compile() {
    # manipulate Makefile/scripts to keep lv2_ttl_generator-calls in script for lv2-postinst-helper
    sed -i 's|"$GEN" "./$FILE"|echo lv2-ttl-generator `pwd`/$FILE >> ${LV2-TURTLE-BUILD-DATA}|g' ${S}/dpf/utils/generate-ttl.sh

    NOOPT=true \
    SKIP_STRIPPING=true \
    BUILD_VST2=true \
    BUILD_LV2=true \
    BUILD_DSSI=true \
    BUILD_JACK=true \
    oe_runmake
}

FILES_${PN} += " \
    ${libdir}/dssi \
    ${libdir}/lv2 \
    ${libdir}/vst \
"
