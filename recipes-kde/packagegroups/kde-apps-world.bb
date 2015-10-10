SUMMARY = "All KDE applications packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    ark \
    baloo-widgets \
    dolphin \
    dolphin-plugins \
    filelight \
    kapman \
    kate \
    katomic \
    kbounce \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kdenlive", "",d)} \
    kio-extras \
    konsole \
    kwalletmanager \
    libkdegames \
    marble \
    oxygen-icons \
"
