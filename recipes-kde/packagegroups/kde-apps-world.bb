SUMMARY = "All KDE applications packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    baloo-widgets \
    dolphin \
    dolphin-plugins \
    filelight \
    kapman \
    kate \
    katomic \
    kdenlive \
    kio-extras \
    konsole \
    libkdegames \
    oxygen-icons \
"
