SUMMARY = "Liri OS package collection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    fluid \
    vibe \
    qtaccountsservice \
    paper-icon-theme \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-wayland", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-shell", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-workspace", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-settings", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "flatpak", "liri-appcenter", "",d)} \
    liri-files \
    liri-terminal \
"

LAYERDEPENDS_meta-qt5-extra += "gnome-layer"
