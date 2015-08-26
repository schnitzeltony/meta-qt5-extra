SUMMARY = "Compton is a compositor for X"
LICENSE = "NTP & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51f8a6ef7a22968bea284609c6093146"

REQUIRED_DISTRO_FEATURES = "x11"

inherit autotools-brokensep

DEPENDS = " \
    virtual/libx11 \
    libxcomposite \
    libxdamage \
    libxfixes \
    libxext \
    libxrender \
    libxrandr \
    libpcre \
    libconfig \
    libxinerama \
    dbus \
"

SRC_URI = " \
    git://github.com/chjj/compton.git \
    file://0001-Makefile-use-pkgconfig-to-find-libpcre.patch \
    file://0002-Makefile-don-t-build-manpages.patch \
"
SRCREV = "86266e00e2bdac46d0a8dabfc1db3e29af91640e"
PV = "v0.1-beta2+git${SRCPV}"

S = "${WORKDIR}/git"

# there are not many machines around supporting gl
EXTRA_OEMAKE = "NO_VSYNC_OPENGL=1"
