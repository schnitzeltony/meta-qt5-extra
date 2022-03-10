SUMMARY = "A glossy cross-platform Matrix client"
HOMEPAGE = "https://spectral.im/"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a39d2b8db8b2a89240c453a7fa49460"

SRC_URI = "gitsm://gitlab.com/spectral-im/spectral.git;protocol=https;branch=master"
SRCREV = "1f95e8888a70000d10317f29c76eb24287bd7390"
PV = "854"
S = "${WORKDIR}/git"

DEPENDS = " \
    qtbase \
    qtdeclarative \
    qtsvg \
    qtmultimedia \
    qtquickcontrols2 \
    libquotient \
    cmark \
    qtkeychain \
"

inherit cmake_qt5_extra gtk-icon-cache

FILES:${PN} += " \
    ${datadir}/metainfo \
"

