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
SRCREV = "eae17fdb00a874edd67f073f087cc74436c71ea9"
SRC_URI += " \
    file://0001-Do-not-enable-recording-by-default-it-requires-GLES3.patch \
    file://0002-qeglfskmsgbmscreen-remove-frame-recording-completely.patch \
"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
