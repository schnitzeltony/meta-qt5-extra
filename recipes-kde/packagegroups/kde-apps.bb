SUMMARY = "KDE apps meta"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    ark \
    dolphin \
    dolphin-plugins \
    dragon \
    filelight \
    kate \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kdenlive", "",d)} \
    konsole \
    kwalletmanager \
    marble \
    spectacle \
    umbrello \
"
