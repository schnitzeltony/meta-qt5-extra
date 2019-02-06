SUMMARY = "An LV2 sampler plugin that plays hydrogen drum kits "
HOMEPAGE = "https://github.com/nicklan/drmr"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += " \
    libsndfile1 \
    libsamplerate0 \
    lv2 \
    expat \
    gtk+ \
"

inherit cmake pkgconfig

SRC_URI = " \
    git://github.com/nicklan/drmr.git;branch=lv2unstable \
    file://0001-CMake-Keep-build-system-flags.patch \
"
SRCREV = "f244f3b09bb290dd6a4b9c14d4abaf69e9861f9d"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"


EXTRA_OECMAKE = " \
    -DLV2_INSTALL_DIR:PATH=${baselib}/lv2 \
"

FILES_${PN} += "${libdir}/lv2"
