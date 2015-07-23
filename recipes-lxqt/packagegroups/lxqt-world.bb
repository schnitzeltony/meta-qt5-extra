SUMMARY = "All lxqt packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    compton-conf \
    liblxqt \
    liblxqt-mount \
    libqtxdg \
    libsysstat \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lximage-qt", "",d)} \
    lxmenu-data \
    lxqt-about \
    lxqt-common \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-config", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-globalkeys", "",d)} \
    lxqt-notificationd \
    lxqt-openssh-askpass \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-panel", "",d)} \
    lxqt-policykit \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-powermanagement", "",d)} \
    lxqt-qtplugin \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-runner", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-session", "",d)} \
    menu-cache \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "obconf-qt", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "pcmanfm-qt", "",d)} \
"
