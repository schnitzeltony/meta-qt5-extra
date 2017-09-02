SUMMARY = "All lxqt packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "compton-conf", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "liblxqt", "",d)} \
    libqtxdg \
    libsysstat \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lximage-qt", "",d)} \
    lxmenu-data \
    lxqt-about \
    lxqt-admin \
    lxqt-common \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-config", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-globalkeys", "",d)} \
    lxqt-l10n \
    lxqt-notificationd \
    lxqt-openssh-askpass \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-panel", "",d)} \
    lxqt-policykit \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-powermanagement", "",d)} \
    lxqt-qtplugin \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-runner", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-session", "",d)} \
    lxqt-sudo \
    menu-cache \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "obconf-qt", "",d)} \
    pavucontrol-qt \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "pcmanfm-qt", "",d)} \
    qtermwidget \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qterminal", "",d)} \
    lxqt-l10n \
"
