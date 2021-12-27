SUMMARY = "All lxqt packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# some packages get dynamically renamed
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "libfm-qt", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "liblxqt", "",d)} \
    libqtxdg \
    libsysstat \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lximage-qt", "",d)} \
    lxmenu-data \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-about", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-admin", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-archiver", "",d)} \
    lxqt-build-tools \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-config", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-globalkeys", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-notificationd", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-openssh-askpass", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-panel", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-policykit", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-powermanagement", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-qtplugin", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-runner", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-session", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "lxqt-sudo", "",d)} \
    lxqt-themes \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "obconf-qt", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "pavucontrol-qt", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "pcmanfm-qt", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qps", "",d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qterminal", "",d)} \
    qtermwidget \
"

RRECOMMENDS:${PN} = " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "picom", "",d)} \
"
