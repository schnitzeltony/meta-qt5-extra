SUMMARY = "Kwave is a sound editor for KDE"
LICENSE = "GPL-2.0-only & LGPL-2.0-only & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.2 & BSD-3-Clause"
LIC_FILES_CHKSUM = " \
    file://LICENSES;md5=6e2b675654cdfe1069f93fcdb9ddec34 \
    file://GNU-LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += "\
    audiofile \
    fftw \
    libopus \
    libsamplerate0 \
    librsvg-native \
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
SRC_URI[sha256sum] = "86857be46eb838aa4efe76c7468bf403c08c331e830c59b12aefa6cbd57f429d"

EXTRA_OECMAKE += "-DWITH_DOC=OFF"
# Aagh: To select a soundcard we need to select another type - so keep oss in as dummy
#EXTRA_OECMAKE += "-DWITH_OSS=OFF"

PACKAGECONFIG ??= "alsa mp3"
PACKAGECONFIG[alsa] = "-DWITH_ALSA=ON,-DWITH_ALSA=OFF,alsa-lib"
PACKAGECONFIG[flac] = "-DWITH_FLAC=ON,-DWITH_FLAC=OFF,flac"
PACKAGECONFIG[mp3] = "-DWITH_MP3=ON,-DWITH_MP3=OFF,id3lib libmad"
PACKAGECONFIG[pulseaudio] = "-DWITH_PULSEAUDIO=ON,-DWITH_PULSEAUDIO=OFF,pulseaudio,pulseaudio-server"
PACKAGECONFIG[qtmultimedia] = "-DWITH_QT_AUDIO=ON,-DWITH_QT_AUDIO=OFF,qtmultimedia"

FILES:${PN} += " \
    ${datadir}/kservicetypes5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
