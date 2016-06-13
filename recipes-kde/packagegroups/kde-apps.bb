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
    kcalc \
    kcolorchooser \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kdenlive", "",d)} \
    khelpcenter \
    kmix \
    konsole \
    ksystemlog \
    kwalletmanager \
    lokalize \
    marble \
    minuet \
    okteta \
    spectacle \
    umbrello \
"
