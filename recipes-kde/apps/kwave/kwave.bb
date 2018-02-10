SUMMARY = "Kwave is a sound editor for KDE"
LICENSE = "GPLv2 & LGPLv2 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.2 & BSD"
LIC_FILES_CHKSUM = " \
    file://LICENSES;md5=90ff5adc50ce32f0425aaa40f1e606bf \
    file://GNU-LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    audiofile \
    fftw \
    libopus \
    libsamplerate0 \
    \
    kcompletion \
    kconfig-native \
    kauth-native \
    kconfigwidgets \
    kcoreaddons-native \
    kcrash \
    kdbusaddons \
    kdoctools-native \
    sonnet-native \
    ki18n \
    kiconthemes \
    kio \
    kservice \
    ktextwidgets \
    kxmlgui \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI += "file://0001-FIND_REQUIRED_PROGRAM-is-broken-use-the-tools-direct.patch"
SRC_URI[md5sum] = "9e9e0578b1798ca2e3432d5cc16840f5"
SRC_URI[sha256sum] = "d3b888f8d9ee5ba51d100d9fc6f232af27c689948cfa5d73a583ff86836fb5d0"

# Aagh: To select a soundcard we need to select another type - so keep oss in as dummy
#EXTRA_OECMAKE += "-DWITH_OSS=OFF"

PACKAGECONFIG ??= "alsa mp3"
PACKAGECONFIG[alsa] = "-DWITH_ALSA=ON,-DWITH_ALSA=OFF,alsa-lib"
PACKAGECONFIG[flac] = "-DWITH_FLAC=ON,-DWITH_FLAC=OFF,flac"
PACKAGECONFIG[mp3] = "-DWITH_MP3=ON,-DWITH_MP3=OFF,id3lib libmad"
PACKAGECONFIG[pulseaudio] = "-DWITH_PULSEAUDIO=ON,-DWITH_PULSEAUDIO=OFF,pulseaudio,pulseaudio-server"
PACKAGECONFIG[qtmultimedia] = "-DWITH_QT_AUDIO=ON,-DWITH_QT_AUDIO=OFF,qtmultimedia"

FILES_${PN} += " \
    ${datadir}/kservicetypes5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
