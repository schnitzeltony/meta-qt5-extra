FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

PACKAGECONFIG_FONTS = "fontconfig"

# session management only for x11 environment
PACKAGECONFIG_DISTRO += " \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "sm", "", d)} \
    accessibility \
    sql-sqlite \
    cups \
    libinput \
"
