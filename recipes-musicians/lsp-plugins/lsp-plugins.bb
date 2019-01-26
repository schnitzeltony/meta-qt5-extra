require ${BPN}.inc

inherit distro_features_check pack_audio_plugins

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    ${BPN}-native \
    php-native \
    cairo \
    gtk+ \
    gtk+3 \
    jack \
    libsndfile1 \
    ladspa-sdk \
    lv2 \
"

SRC_URI += " \
    file://0001-Makefile-align-for-oe-cross-build.patch \
"

ARM_INSTRUCTION_SET = "arm"

def profile_handler(d):
    profile = d.getVar('DEFAULTTUNE', True)
    features = d.getVar('TUNE_FEATURES', True).split()
    if 'armv7a' in features or 'armv7ve' in features:
        profile = 'armv7a'
    return profile

EXTRA_OEMAKE += " \
    BUILD_PLATFORM=Linux \
    BUILD_PROFILE=${@profile_handler(d)} \
    PREFIX=${prefix} \
"

do_compile_prepend() {
    export LDLDFLAGS="`echo $LDFLAGS | sed 's:-Wl,::g'`"
    export CC="${CXX}"
    export CC_ARCH="${CXXFLAGS}"
}


do_install() {
    ${MAKE} ${EXTRA_OEMAKE} DESTDIR=${D} install
}

FILES_${PN} += "${libdir}/lsp-plugins-jack-core-${PV}.so"

PACKAGES =+ "${PN}-standalone"
FILES_${PN}-standalone = "${bindir}"
