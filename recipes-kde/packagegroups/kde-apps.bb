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
    gwenview \
    kate \
    kcolorchooser \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kdenlive", "",d)} \
    khelpcenter \
    konsole \
    kwalletmanager \
    lokalize \
    marble \
    minuet \
    spectacle \
    umbrello \
"
