SUMMARY = "Helm - a free polyphonic synth with lots of modulation"
HOMEPAGE = "http://tytel.org/helm/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit autotools-brokensep qemu-ext distro_features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    virtual/libx11 \
    virtual/libgl \
    libxext \
    libxinerama \
    libxcursor \
    curl \
    alsa-lib \
    jack \
    freetype \
    hicolor-icon-theme \
"

SRC_URI += " \
    git://github.com/mtytel/helm.git \
    file://0001-Makefile-remove-machine-detection-it-won-t-work-for-.patch \
    file://0002-do-not-create-ttl-files-it-won-t-work-fo-cross.patch \
    file://0003-use-standard-vst-path.patch \
    file://0004-set-VECTORIZE_LOOP-for-gcc.patch \
    file://0005-use-single-precision-floats-it-performs-much-better.patch \
"
SRCREV = "927d2ed27f71a735c3ff2a1226ce3129d1544e7e"
PV = "0.9.0"
S = "${WORKDIR}/git"

CXXFLAGS += "-I ${STAGING_INCDIR}/freetype2"

do_compile_append() {
    ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${S}/builds/linux/LV2/lv2_ttl_generator')} ${S}/builds/linux/LV2/build/helm.so
    cp *.ttl ${S}/builds/linux/LV2/helm.lv2/
}

FILES_${PN} += " \
    ${datadir}/icons \
    ${libdir}/lv2 \
    ${libdir}/vst \
"
