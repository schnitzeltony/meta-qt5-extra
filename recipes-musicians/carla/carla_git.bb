SUMMARY = "Audio plugin host"
HOMEPAGE = "http://kxstudio.linuxaudio.org/Applications:Carla"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://doc/GPL.txt;md5=4641e94ec96f98fabc56ff9cc48be14b \
    file://doc/LGPL.txt;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

SRC_URI = " \
    git://github.com/falkTX/Carla.git \
    file://0001-do-not-try-to-cross-run-carla-lv2-export.patch \
    file://0002-Do-not-try-to-find-Qt5-host-bins-it-won-t-work.patch \
    file://0003-Fluidsynths-Ensure-fluidsynth-s-defaults-are-set-onc.patch \
    file://0004-Fixes-for-fluidsynth-2.0.0.patch \
"
SRCREV = "d73c0788ccc5fb9019d224046ef1b652aa5a9bbe"
S = "${WORKDIR}/git"
PV = "1.9.11+git${SRCPV}"

REQUIRED_DISTRO_FEATURES = "x11"

inherit qmake5_base pkgconfig qemu-ext distro_features_check mime gtk-icon-cache

B = "${S}"

DEPENDS += " \
    python3-pyqt5-native \
    qtbase-native \
    qtbase \
    gtk+ \
    gtk+3 \
    liblo \
    pulseaudio \
    fluidsynth \
    libsndfile1 \
"

EXTRA_OEMAKE += " \
    DEFAULT_QT=5 \
    NOOPT=true \
    HAVE_PYQT=true \
    HAVE_PYQT4=false \
    HAVE_PYQT5=true \
    SKIP_STRIPPING=true \
"

export QT5_HOSTBINS="${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}"

do_configure() {
    oe_runmake features
}

do_compile_append() {
    cd ${S}/bin
    ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', 'carla-lv2-export')}
}

do_install() {
    oe_runmake DESTDIR=${D} PREFIX=${prefix} LIBDIR=${libdir} install
}

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/mime \
    ${libdir}/lv2 \
    ${libdir}/vst \
"

INSANE_SKIP_${PN} = "dev-so"

RDEPENDS_${PN} += "python3-pyqt5 bash"
