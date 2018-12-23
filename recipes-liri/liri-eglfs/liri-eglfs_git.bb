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
    libinput \
    liri-libliri \
    liri-qtudev \
"

PV = "0.0.0+git${SRCPV}"
SRCREV = "23941d3b59b11c24799b278dc28fa7c95588082b"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
