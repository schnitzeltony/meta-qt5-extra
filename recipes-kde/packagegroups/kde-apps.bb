SUMMARY = "KDE apps meta"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    ark \
    baloo-widgets \
    dolphin \
    dolphin-plugins \
    dragon \
    filelight \
    gwenview \
    kate \
    kcalc \
    kcolorchooser \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kdenlive", "",d)} \
    kdf \
    khelpcenter \
    kio-extras \
    kmix \
    kolourpaint \
    konsole \
    krita \
    ksystemlog \
    kwalletmanager \
    kwave \
    libkexiv2 \
    lokalize \
    marble \
    minuet \
    okteta \
    okular \
    oxygen-icons \
    spectacle \
    umbrello \
"
