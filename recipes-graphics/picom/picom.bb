SUMMARY = "A lightweight compositor for X11"
HOMEPAGE = "https://github.com/yshui/picom"
LICENSE = "MPL-2.0 & MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=a9a621b5a1b8f702c605093d657b550c"

SRC_URI = "git://github.com/yshui/picom.git;branch=stable/8"
SRCREV = "dac85eac10082dfc3df463aaa74b811144e22122"
PV = "8.2"
S = "${WORKDIR}/git"

DEPENDS = " \
    libxext \
    libxdamage \
    libxfixes \
    xcb-util-renderutil \
    libxrender \
    libxrandr \
    libxcomposite \
    xcb-util-image \
    libxpresent \
    libxinerama \
    libdrm \
    libev \
    pixman \
    dbus \
    libconfig \
    libpcre \
    uthash \
"

inherit meson features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'opengl', d)}"
PACKAGECONFIG[opengl] = "-Dopengl=true,-Dopengl=false,virtual/libgl"
