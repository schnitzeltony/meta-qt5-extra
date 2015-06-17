FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# we need this for bleeding edge qtwayland - this can go in 5.5 hopefully
SRC_URI += "file://0001-Add-a-function-for-QPA-plugins-to-explicitly-destroy.patch"

# session management only for x11 environment
PACKAGECONFIG_DISTRO += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "sm", "", d)}"
