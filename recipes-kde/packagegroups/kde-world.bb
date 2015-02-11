SUMMARY = "All kde packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup distro_features_check

RDEPENDS_${PN} = " \
    kf5-world \
    plasma-world \
    \
    extra-cmake-modules \ 
    phonon \
    polkit-qt-1 \
    \
    kate \
    oxygen-icons \
"



