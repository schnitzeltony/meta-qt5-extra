FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# session management only for x11 environment
PACKAGECONFIG_DISTRO += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "sm", "", d)} qml-debug accessibility"
