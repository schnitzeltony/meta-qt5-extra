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


# We have some recipes not building with qtbase for gles2
# and performance regression could not be detected
# so override for some well known machines

# NXP imx without blobs:
PACKAGECONFIG_GL_use-mainline-bsp_remove = "gles2"
PACKAGECONFIG_GL_use-mainline-bsp_append = " gl"
