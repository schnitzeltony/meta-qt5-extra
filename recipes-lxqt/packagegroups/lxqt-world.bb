SUMMARY = "All lxqt packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup distro_features_check

RDEPENDS_${PN} = " \
    compton-conf \
    liblxqt \
    liblxqt-mount \
    libqtxdg \
    libsysstat \
    lximage-qt \
    lxmenu-data \
    lxqt-about \
    lxqt-common \
    lxqt-config \
    lxqt-globalkeys \
    lxqt-notificationd \
    lxqt-panel \
    lxqt-policykit \
    lxqt-powermanagement \
    lxqt-qtplugin \
    lxqt-runner \
    lxqt-session \
    menu-cache \
    pcmanfm-qt \
"
