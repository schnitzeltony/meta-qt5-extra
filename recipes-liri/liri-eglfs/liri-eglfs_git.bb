SUMMARY = "EGL fullscreen platform plugin"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"
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
SRCREV = "127e9b5ce68902ad35bb8ce23be121d8b632e5eb"
SRC_URI += " \
    file://0001-qeglfskmsgbmscreen-remove-frame-recording-completely.patch \
"
S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
