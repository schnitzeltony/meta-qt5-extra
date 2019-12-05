SUMMARY = "KDE apps meta"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    analitza \
    ark \
    baloo-widgets \
    dolphin \
    dolphin-plugins \
    dragon \
    filelight \
    gwenview \
    kalgebra \
    kalzium \
    kate \
    kcachegrind \
    kcalc \
    kcharselect \
    kcolorchooser \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kdenlive", "",d)} \
    kdf \
    kexi \
    kfind \
    khelpcenter \
    kio-extras \
    kmag \
    kmix \
    kmplot \
    kolourpaint \
    konsole \
    krita \
    ksystemlog \
    kwalletmanager \
    kwave \
    libkdcraw \
    libkexiv2 \
    lokalize \
    marble \
    minuet \
    okteta \
    okular \
    spectacle \
    umbrello \
"
