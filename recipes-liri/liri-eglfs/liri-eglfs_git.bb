SUMMARY = "EGL fullscreen platform plugin"
LICENSE = "GPLv3 & LGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

DEPENDS += " \
    liri-libliri \
    liri-qtudev \
    libinput \
    drm \
    virtual/libgbm \
"

PV = "0.0.0+git${SRCPV}"

SRCREV = "ad69d7331af5ea34a18f13da9ec18755fae92edb"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
