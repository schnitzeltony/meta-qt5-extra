SUMMARY = "All layer packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    antimony \
    \
    gottet \
    hexalate \
    \
    compton \
    qpdfview \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "sddm", "",d)} \
    xcb-util-cursor \
    \
    qtiohelper \
    \
    chromaprint \
    drumstick\
    qmmp \
    qt-gstreamer \
    timidity++ \
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
