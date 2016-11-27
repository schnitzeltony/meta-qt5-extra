SUMMARY = "All layer packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

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
    chromaprint \
    drumkv1 \
    drumstick\
    ftgl \
    ladspa-sdk \
    libmp4v2 \
    libvisual \
    libxmp \
    lmms \
    lv2 \
    mixxx \
    portmidi \
    projectm \
    qjackctl \
    qmmp \
    qsynth \
    qt-gstreamer \
    qtractor \
    rubberband \
    samplv1 \
    soundtouch \
    synthv1 \
    timidity++ \
    vamp-plugin-sdk \
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
    hawaii-world \
    kde-world \
    lxqt-world \
"
