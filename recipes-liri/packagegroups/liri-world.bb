SUMMARY = "Liri OS package collection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# some packages get dynamically renamed
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    liri-browser \
    liri-calculator \
    liri-eglfs \
    liri-files \
    liri-fluid \
    liri-libliri \
    liri-networkmanager \
    liri-player \
    liri-power-manager \
    ${@bb.utils.contains("DISTRO_FEATURES", "pulseaudio", "liri-pulseaudio", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-qml-xwayland", "",d)} \
    liri-qtaccountsservice \
    liri-qtintegration \
    liri-qtgsettings \
    liri-qtudev \
    liri-screencast \
    liri-screenshot \
    liri-session \
    liri-settings \
    ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "liri-shell", "",d)} \
    liri-terminal \
    liri-text \
    liri-themes liri-themes-sddm \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'meta-initramfs', 'liri-themes-plymouth', '', d)} \
    liri-wallpapers \
    liri-wayland \
"

#LAYERDEPENDS_meta-qt5-extra += "gnome-layer"

#    liri-calamares-branding \
#    ${@bb.utils.contains("DISTRO_FEATURES", "flatpak", "liri-appcenter", "",d)} 
#    paper-icon-theme 
# liri-themes-grub
