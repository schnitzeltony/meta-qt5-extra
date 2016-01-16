SUMMARY = "All kde packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup distro_features_check

RDEPENDS_${PN} = " \
    kf5-world \
    plasma-world \
    kde-apps-world \
    \
    kpmcore \
    libdebconf-kde \
    libqapt \
    muon \
    partitionmanager \
    phonon \
    polkit-qt-1 \
    qca \
"



