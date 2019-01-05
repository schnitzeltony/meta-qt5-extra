SUMMARY = "All music meta-qt5-extra music packages"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

# avoid performance sink
RDEPENDS_${PN} = " \
    baloo-no-autostart \
"

# unfortunately there is no way to add a comment. So folders, containing
# multiple recipes are separated by two '\' before and after. That way the
# sequence as displayed in file browser is kept more or less and avoids to
# overlook a package.

RDEPENDS_${PN} += " \
    amsynth \
    ardour5 \
    aubio \
    audio-tweaks \
    bristol \
    calf \
    carla \
    chromaprint \
    csound \
    \
    \
    lpd8editor \
    \
    \
    distrho-ports-lv2 distrho-ports-presets distrho-ports-vst \
    distrho-ports-extra-lv2 distrho-ports-extra-vst \
    dpf-plugins-ladspa dpf-plugins-lv2 dpf-plugins-vst \
    lv2-ttl-generator \
    \
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
    \
    drumgizmo \
    drumstick \
    dssi \
    dssi-vst \
    ftgl \
    gmidimonitor \
    guitarix \
    helm \
    hydrogen hydrogen-drumkits \
    infamousplugins \
    \
    \
    clthreads \
    clxclient \
    zita-convolver \
    zita-resampler \
    \
    \
    ladspa-sdk \
    liblo \
    libmp4v2 \
    libsmf \
    libxmp \
    lmms \
    lrdf \
    lsp-plugins-standalone lsp-plugins-ladspa lsp-plugins-lv2 lsp-plugins-vst \
    lv2 \
    mixxx \
    muse \
    nekobee \
    \
    \
    arty-fx \
    fabla \
    luppp \
    openav-presets \
    sorcer \
    \
    \
    polyphone \
    portmidi \
    projectm \
    qmidiarp \
    qmmp \
    qt-gstreamer \
    \
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
    \
    rosegarden \
    rubberband \
    setbfree \
    \
    \
    fluidsynth-dssi \
    fluidsynth-dssi-defconfig \
    hexter \
    whysynth \
    xsynth-dssi \
    \
    \
    sf-tools \
    soundfont-collection-meta \
    \
    \
    soundtouch \
    stk \
    supercollider \
    timidity++ \
    triceratops-lv2 \
    vamp-plugin-sdk \
    wolf-shaper-dssi wolf-shaper-lv2 wolf-shaper-vst \
    \
    \
    avldrums.lv2 \
    dpl.lv2 \
    fil4.lv2 \
    meters.lv2 \
    midifilter.lv2 \
    tuna.lv2 \
    \
    \
    yoshimi \
    zam-plugins-standalone zam-plugins-ladspa zam-plugins-lv2 zam-plugins-vst \
    zyn \
"

# non working
# tomahawk

# empty
# qm-dsp
