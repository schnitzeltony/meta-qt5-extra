SUMMARY = "Liri OS package collection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    fluid \
    ${@bb.utils.contains("DISTRO_FEATURES", "flatpak", "liri-appcenter", "",d)} \
    liri-browser \
    liri-calculator \
    liri-files \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-settings", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-shell", "",d)} \
    liri-terminal \
    liri-themes-grub liri-themes-plymouth liri-themes-sddm \
    liri-wallpapers \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-wayland", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-workspace", "",d)} \
    paper-icon-theme \
    qtaccountsservice \
    vibe \
"

LAYERDEPENDS_meta-qt5-extra += "gnome-layer"
