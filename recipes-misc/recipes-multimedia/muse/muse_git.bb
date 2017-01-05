SUMMARY = "MusE is a digital audio workstation"
HOMEPAGE = "http://muse-sequencer.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=328283dc167a7b37ffdc59f524a7fc4d"

DEPENDS += " \
    qtbase \
    qttools-native \
    jack \
    liblo \
    dssi \
    gtkmm \
    fluidsynth \
    serd \
    lilv \
"

inherit cmake_qt5 pkgconfig gtk-icon-cache distro_features_check mime qt5-translation

SRC_URI = " \
    git://github.com/muse-sequencer/muse.git \
"
SRCREV = "ee2773a62bb8bb4dc38383cb42a8d4b35b083902"
PV = "3.0.0pre2"
S = "${WORKDIR}/git/muse3"

#ENABLE_LV2 ENABLE_FLUID

# Have no idea where flags are lost. Anyway driver would fail
# | driver/libmuse_driver.so: error: undefined reference to 'pthread_cancel'
# | driver/libmuse_driver.so: error: undefined reference to 'pthread_create'
# | driver/libmuse_driver.so: error: undefined reference to 'pthread_join'
# | driver/libmuse_driver.so: error: undefined reference to 'dlsym'
# | collect2: error: ld returned 1 exit status
LDFLAGS += "-lpthread -ldl"

QT_TRANSLATION_FILES = "${datadir}/*/locale/*.qm"
FILES_${PN}-locale = "${datadir}/muse-3.0/locale"

FILES_${PN} += " \
    ${datadir}/mime \
    \
    ${datadir}/muse-3.0/didyouknow.txt \
    ${datadir}/muse-3.0/splash.png \
    \
    ${datadir}/muse-3.0/demos \
    ${datadir}/muse-3.0/drummaps \
    ${datadir}/muse-3.0/instruments \
    ${datadir}/muse-3.0/metronome \
    ${datadir}/muse-3.0/plugins \
    ${datadir}/muse-3.0/presets \
    ${datadir}/muse-3.0/pybridge \
    ${datadir}/muse-3.0/scoreglyphs \
    ${datadir}/muse-3.0/scripts \
    ${datadir}/muse-3.0/themes \
    ${datadir}/muse-3.0/templates \
    ${datadir}/muse-3.0/utils \
    ${datadir}/muse-3.0/wallpapers \
    \
    ${libdir}/muse-3.0/synthi \
    ${libdir}/muse-3.0/modules \
    ${libdir}/muse-3.0/plugins \
"

RDEPENDS_${PN} += "python"
