SUMMARY = "All KF5 packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

TIER_1 = " \
    kdecoration \
"

TIER_2 = " \
"

TIER_3 = " \
    kactivitymanagerd \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "plasma-workspace", "",d)} \
"

UNTIER = " \
    bluedevil \
    breeze \
    breeze-gtk \
    breeze-plymouth \
    discover \
    kde-cli-tools \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kde-gtk-config", "",d)} \
    kdeplasma-addons \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kgamma5", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "khotkeys", "",d)} \
    kinfocenter \
    kmenuedit \
    kscreen \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kscreenlocker", "",d)} \
    ksshaskpass \
    ksysguard \
    kwallet-pam \
    kwayland-integration \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kwin", "",d)} \
    kwrited \
    libkscreen \
    libksysguard \
    milou \
    oxygen \
    oxygen-fonts \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "plasma-desktop", "",d)} \
    plasma-integration \
    plasma-mediacenter \
    plasma-nm \
    plasma-pa \
    plasma-workspace-wallpapers \
    polkit-kde-agent-1 \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "powerdevil", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "sddm-kcm", "",d)} \
    systemsettings \
    user-manager \
"

RDEPENDS_${PN} = " \
    ${TIER_1} \
    ${TIER_2} \
    ${TIER_3} \
    ${UNTIER} \
"
