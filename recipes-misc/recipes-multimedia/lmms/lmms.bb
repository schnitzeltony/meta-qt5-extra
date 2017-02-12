require ${BPN}.inc

inherit cmake_qt5 mime gtk-icon-cache

SRC_URI += "file://0001-Find-native-bin2res.patch"

DEPENDS += " \
    ${BPN}-native \
    qtbase \
    qttools-native \
    jack \
    fftw \
    stk \
    fluidsynth \
    portaudio-v19 \
    libsdl \
"

EXTRA_OECMAKE += " \
    -DWANT_QT5=ON \
"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/menu \
"
