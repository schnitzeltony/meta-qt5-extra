require ${BPN}.inc

inherit cmake_qt5 mime gtk-icon-cache pkgconfig

SRC_URI += " \
    file://0001-Find-native-bin2res.patch \
    file://0002-zynaddsubfx-link-agains-X11.patch \
"

DEPENDS += " \
    ${BPN}-native \
    qtbase \
    qttools-native \
    jack \
    fftw \
    stk \
    lame \
    fluidsynth \
    portaudio-v19 \
    libsdl \
    carla \
    fltk fltk-native \
"

EXTRA_OECMAKE += " \
    -DWANT_QT5=ON \
"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/menu \
"
