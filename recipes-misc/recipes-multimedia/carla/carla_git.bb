SUMMARY = "Audio plugin host"
HOMEPAGE = "http://kxstudio.linuxaudio.org/Applications:Carla"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://doc/GPL.txt;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://doc/LGPL.txt;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

SRC_URI = " \
    git://github.com/falkTX/Carla.git \
    file://0001-Use-fluid-instead-of-ntk-fluid.patch \
    file://0002-do-not-try-to-cross-run-carla-lv2-export.patch \
    file://0003-Don-t-disable-EXPERIMENTAL_PLUGINS.patch \
    file://0004-do-not-autodetect-pyqt-it-won-t-work-in-oe.patch \
    file://0005-don-t-pin-version-when-finding-libpng.patch \
    file://0006-do-not-build-zynaddsubfx-we-have-a-better-version.patch \
"
SRCREV = "4a1e17888fc9abb0a4ea4a83d8f7020a5eabda1c"
S = "${WORKDIR}/git"
PV = "1.9.7b+git${SRCPV}"

REQUIRED_DISTRO_FEATURES = "x11"

inherit qmake5_base autotools-brokensep pkgconfig qemu-ext distro_features_check mime gtk-icon-cache

# Notes on fltk-native / ntk
# Ntk is a fork of fltk using cairo. Ntk cannot be build native easily without
# X11-cairo. So use fluid (fltk-native) instead of ntk-fluid

DEPENDS += " \
    fltk-native \
    python3-pyqt5-native \
    freetype \
    libpng \
    gtk+ \
    gtk+3 \
    liblo \
    pulseaudio \
    file \
    fluidsynth \
    projectm \
    clthreads \
    clxclient \
    zita-resampler \
    zita-convolver \
"

EXTRA_OEMAKE += " \
    DEFAULT_QT=5 \
    PREFIX=${prefix} \
    NOOPT=true \
    EXPERIMENTAL_PLUGINS=true \
    HAVE_PYQT=true \
    HAVE_PYQT4=false \
    HAVE_PYQT5=true \
"

LDFLAGS += "-lpng"

do_compile_append() {
    cd ${S}/bin
    ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', 'carla-lv2-export')}
}

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/mime \
    ${libdir}/python3 \
    ${libdir}/lv2 \
    ${libdir}/vst \
"

INSANE_SKIP_${PN} = "dev-so already-stripped"

RDEPENDS_${PN} += "python3-pyqt5 bash"
