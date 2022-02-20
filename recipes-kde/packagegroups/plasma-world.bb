SUMMARY = "All KDE plasma packages - not just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# some packages get dynamically renamed
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

OTHER = " \
    plasma-mobile-world \
"

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
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'meta-initramfs', 'breeze-plymouth', '', d)} \
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
    kwallet-pam \
    kwayland-integration \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "kwin", "",d)} \
    kwrited \
    layer-shell-qt \
    libkscreen \
    libksysguard \
    milou \
    oxygen \
    oxygen-fonts \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', bb.utils.contains('BBFILE_COLLECTIONS', 'browser-layer', 'plasma-browser-integration', '', d), '', d)} \
    plasma-desktop \
    plasma-integration \
    plasma-nano \
    plasma-nm \
    plasma-pa \
    plasma-mobile \
    plasma-systemmonitor \
    plasma-vault \
    plasma-workspace-wallpapers \
    ${@bb.utils.contains("DISTRO_FEATURES", "polkit", "polkit-kde-agent-1", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "powerdevil", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "sddm-kcm", "",d)} \
    systemsettings \
"

RDEPENDS:${PN} = " \
    ${OTHER} \
    ${TIER_1} \
    ${TIER_2} \
    ${TIER_3} \
    ${UNTIER} \
"
