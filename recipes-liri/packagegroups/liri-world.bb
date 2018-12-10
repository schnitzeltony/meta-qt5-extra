SUMMARY = "Liri OS package collection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    liri-eglfs \
    liri-files \
    liri-fluid \
    liri-libliri \
    liri-networkmanager \
    liri-power-manager \
    ${@bb.utils.contains("DISTRO_FEATURES", "pulseaudio", "liri-pulseaudio", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-qml-xwayland", "",d)} \
    liri-qtaccountsservice \
    liri-qtgsettings \
    liri-qtudev \
    liri-screencast \
    liri-screenshot \
    liri-settings \
    liri-terminal \
    liri-text \
    liri-wallpapers \
"

#LAYERDEPENDS_meta-qt5-extra += "gnome-layer"

#    liri-calamares-branding \
#    ${@bb.utils.contains("DISTRO_FEATURES", "flatpak", "liri-appcenter", "",d)} 
#    liri-browser 
#    liri-calculator 
#    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-shell", "",d)} 
#    liri-themes-grub liri-themes-plymouth liri-themes-sddm 
#    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-wayland", "",d)} 
#    paper-icon-theme 

