SUMMARY = "All music meta-qt5-extra music packages"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

# unfortunately there is no way to add a comment. So folders, containing
# multiple recipes are separated by two '\' before and after. That way the
# sequence as displayed in file browser is kept more or less and avoids to
# overlook a package.

RDEPENDS_${PN} = " \
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
    distrho-ports distrho-ports-presets \
    distrho-ports-extra \
    dpf-plugins \
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
    libvisual \
    libxmp \
    lmms \
    lrdf \
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
    timidity++ \
    triceratops-lv2 \
    vamp-plugin-sdk \
    \
    \
    avldrums.lv2 \
    fil4.lv2 \
    meters.lv2 \
    midifilter.lv2 \
    tuna.lv2 \
    \
    \
    yoshimi \
    ${@bb.utils.contains("DISTRO_FEATURES", "opengl", "zyn-fusion", "zynaddsubfx",d)} \
"

# non working
# tomahawk

# empty
# qm-dsp
