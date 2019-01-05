SUMMARY = "EGL fullscreen platform plugin"
LICENSE = "GPLv3 & LGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

DEPENDS += " \
    fontconfig \
    drm \
    virtual/libgbm \
    virtual/egl \
    virtual/libgles2 \
    libinput \
    liri-libliri \
    liri-qtudev \
"

PV = "0.0.0+git${SRCPV}"
SRCREV = "25b282a7e30ca0aa90286fcf4ba5461ec8d4692b"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
