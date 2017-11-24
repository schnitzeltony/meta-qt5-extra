SUMMARY = "Fluxbox is a lightweight windowmanager for X"
HOMEPAGE = "http://fluxbox.org/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=e90c7c0bee6fc368be0ba779e0eac053"

REQUIRED_DISTRO_FEATURES = "x11"

inherit autotools-brokensep pkgconfig distro_features_check manpages

DEPENDS = " \
    virtual/libx11 \
    libxinerama \
    libxrandr \
    libxft \
    libxpm \
    fontconfig \
    fribidi \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://fluxbox.desktop \
"
SRC_URI[md5sum] = "d99d7710f9daf793e0246dae5304b595"
SRC_URI[sha256sum] = "c99e2baa06fff1e96342b20415059d12ff1fa2917ade0173c75b2fa570295b9f"

do_install_append() {
    install -d ${D}/${datadir}/xsessions
    install -m 0644 -p ${WORKDIR}/fluxbox.desktop ${D}/${datadir}/xsessions
}

FILES_${PN} += "${datadir}/xsessions"
