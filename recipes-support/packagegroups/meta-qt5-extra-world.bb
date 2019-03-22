SUMMARY = "All layer packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    antimony \
    \
    gottcode-world \
    \
    compton \
    qpdfview \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "sddm", "",d)} \
    xcb-util-cursor \
    \
    qtiohelper \
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
    meta-qt5-extra-music-world \
"
