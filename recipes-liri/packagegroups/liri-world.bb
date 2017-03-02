SUMMARY = "Liri OS package collection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    fluid \
    ${@bb.utils.contains("DISTRO_FEATURES", "flatpak", "liri-appcenter", "",d)} \
    liri-browser \
    liri-files \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-settings", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-shell", "",d)} \
    liri-terminal \
    liri-themes \
    liri-wallpapers \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-wayland", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-workspace", "",d)} \
    paper-icon-theme \
    qtaccountsservice \
    vibe \
"

LAYERDEPENDS_meta-qt5-extra += "gnome-layer"
