SUMMARY = "All music meta-qt5-extra music packages"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    distrho-ports distrho-ports-presets \
    distrho-ports-extra \
    dpf-plugins \
    lv2-ttl-generator \
    \
    ganv \
    lilv \
    mda-lv2 \
    patchage \
    serd \
    sord \
    sratom \
    suil \
    \
    clthreads \
    clxclient \
    zita-convolver \
    zita-resampler \
    \
    arty-fx \
    \
    drumkv1 drumkv1-presets \
    padthv1 padthv1-presets \
    qjackctl qjackctl-defconfig \
    qmidictl \
    qmidinet \
    qsynth \
    qtractor qtractor-defconfig \
    samplv1 \
    synthv1 synthv1-presets \
    \
    fluidsynth-dssi \
    hexter \
    whysynth \
    xsynth-dssi \
    \
    sf-tools \
    soundfont-collection-meta \
    \
    avldrums.lv2 \
    fil4.lv2 \
    meters.lv2 \
    midifilter.lv2 \
    tuna.lv2 \
    \
    \
    amsynth \
    ardour5 \
    aubio \
    audio-tweaks \
    calf \
    carla \
    chromaprint \
    csound \
    drumstick \
    dssi \
    dssi-vst \
    ftgl \
    gmidimonitor \
    guitarix \
    helm \
    hydrogen hydrogen-drumkits \
    infamousplugins \
    ladspa-sdk \
    liblo \
    libmp4v2 \
    libsmf \
    libvisual \
    libxmp \
    lmms \
    lrdf \
    lv2 \
    mixxx \
    muse \
    nekobee \
    polyphone \
    portmidi \
    projectm \
    qmidiarp \
    qmmp \
    qt-gstreamer \
    rosegarden \
    rubberband \
    setbfree \
    soundtouch \
    stk \
    timidity++ \
    triceratops-lv2 \
    vamp-plugin-sdk \
    yoshimi \
    zynaddsubfx \
"

# non working
# tomahawk

# empty
# qm-dsp
