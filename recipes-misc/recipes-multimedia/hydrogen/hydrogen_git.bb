SUMMARY = "Hydrogen is an advanced drum machine for GNU/Linux"
HOMEPAGE = "http://www.hydrogen-music.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

# Note for LADSPA: If I read cmakeFindLadspa.cmake correctly, LASPA plugins
# available are searched during build process. Since I have no idea which
# plugins are useful for hydrogen (maybe caps??)  and all those have to go to
# RDEPEND LASPA support is skipped - althogh mentioned as 'desired' in config
# log. If it turns out that LADSPA is required, we need ladspa-sdk-native for 
# 'listplugins' tool.

DEPENDS += " \
    qtbase \
    qtxmlpatterns \
    libtar \
    libarchive \
    libsndfile1 \
    alsa-lib \
    liblo \
    jack \
    portaudio-v19 \
    portmidi \
    lrdf \
    pulseaudio \
    rubberband \
    cppunit \
"

SRC_URI = " \
    git://github.com/hydrogen-music/hydrogen.git \
    file://0001-Fix-man-installation-path.patch \
    file://0002-hydrogen.default.conf-do-not-show-developer-warnings.patch \
"
SRCREV = "f0d0e8cf2498ae94dd78842078c70c11787f3c08"
PV ="0.9.7+git${SRCPV}"

S = "${WORKDIR}/git"

inherit cmake_qt5 manpages

CMAKE_FLAGS = " \
    -DWANT_DEBUG=OFF \
"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/appdata \
    ${libdir}/libhydrogen-core* \
"
