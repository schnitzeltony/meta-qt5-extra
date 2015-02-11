SUMMARY = "All KF5 packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup distro_features_check

TIER_1 = " \
    kdecoration \
"

TIER_2 = " \
    kfilemetadata \
"

TIER_3 = " \
    baloo \
    plasma-workspace \
"

UNTIER = " \
    breeze \
    kde-cli-tools \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kde-gtk-config", "",d)} \
    kdeplasma-addons \
    khelpcenter \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "khotkeys", "",d)} \
    kinfocenter \
    kio-extras \
    kmenuedit \
    kscreen \
    ksshaskpass \
    ksysguard \
    kwayland \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kwin", "",d)} \
    kwrited \
    libkscreen \
    libksysguard \
    libmm-qt \
    milou \
    muon \
    oxygen \
    oxygen-fonts \
    plasma-desktop \
    plasma-nm \
    plasma-workspace-wallpapers \
    polkit-kde-agent-1 \
    powerdevil \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "sddm-kcm", "",d)} \
    systemsettings \
"

RDEPENDS_${PN} = " \
    ${TIER_1} \
    ${TIER_2} \
    ${TIER_3} \
    ${UNTIER} \
"
