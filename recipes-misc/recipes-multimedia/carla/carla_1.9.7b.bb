SUMMARY = "Audio plugin host"
HOMEPAGE = "http://kxstudio.linuxaudio.org/Applications:Carla"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://doc/GPL.txt;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://doc/LGPL.txt;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

SRC_URI = " \
    https://github.com/falkTX/Carla/archive/${PV}.tar.gz \
    file://0001-Use-fluid-instead-of-ntk-fluid.patch \
    file://0002-do-not-try-to-cross-run-carla-lv2-export.patch \
    file://0003-native-plugins-don-t-kill-LDFLAGS-set-by-build-syste.patch \
"
SRC_URI[md5sum] = "d84613ea9fbc42f46cd9831b2d263e87"
SRC_URI[sha256sum] = "05160ba26a4cc8420b776da2c046aa04b1aa01b0c769059251e0e9ba41e0e325"

S = "${WORKDIR}/Carla-${PV}"

REQUIRED_DISTRO_FEATURES = "x11"

inherit qmake5_base autotools-brokensep qemu-ext distro_features_check

# Notes on fltk-native / ntk
# Ntk is a fork of fltk using cairo. Ntk cannot be build native easily without
# X11-cairo. So use fluid (fltk-native) instead of ntk-fluid

DEPENDS += " \
    fltk-native \
    ntk \
    gtk+ \
    gtk+3 \
    liblo \
    fftw \
    pulseaudio \
    file \
    fluidsynth \
    projectm \
    mxml \
"

EXTRA_OEMAKE += " \
    DEFAULT_QT=5 \
    PREFIX=${prefix} \
    NOOPT=true \
"

do_compile_append() {
    cd ${S}/bin
    ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', 'carla-lv2-export')}
}

FILES_${PN} += " \
    ${libdir}/python3 \
    ${libdir}/lv2 \
    ${libdir}/vst \
"

INSANE_SKIP_${PN} = "dev-so already-stripped"
