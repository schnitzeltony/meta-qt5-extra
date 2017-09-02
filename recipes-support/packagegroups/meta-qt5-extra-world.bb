SUMMARY = "All layer packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    antimony \
    \
    gottet \
    hexalate \
    peg-e \
    simsu \
    \
    compton \
    qpdfview \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "sddm", "",d)} \
    xcb-util-cursor \
    \
    qtiohelper \
    \
    amsynth \
    ardour5 \
    aubio \
    calf \
    chromaprint \
    drumkv1 \
    drumstick\
    dssi \
    dssi-vst \
    fluidsynth-dssi \
    fluidplug \
    ftgl \
    ganv \
    helm \
    hexter \
    ladspa-sdk \
    liblo \
    libmp4v2 \
    libvisual \
    libxmp \
    lilv \
    lmms \
    lrdf \
    lv2 \
    mixxx \
    muse \
    patchage \
    polyphone \
    portmidi \
    projectm \
    qjackctl \
    qmmp \
    qsynth \
    qt-gstreamer \
    qtractor \
    rosegarden \
    rubberband \
    samplv1 \
    serd \
    sord \
    soundtouch \
    sratom \
    synthv1 \
    timidity++ \
    vamp-plugin-sdk \
    whysynth \
    zynaddsubfx \
    \
    exiv2 \
    grantlee \
    libcddb \
    libcdio-paranoia \
    libdbusmenu-qt5 \
    libpwquality \
    libraw \
    libstatgrab \
    lmdb \
    mlt \
    translate-toolkit \
    xapian-core \
    \
    liri-world \
    kde-world \
    lxqt-world \
"
