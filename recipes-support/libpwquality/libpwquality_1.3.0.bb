SUMMARY = "Library for password quality checking and generating random passwords"
HOMEPAGE = "https://launchpad.net/libpwquality"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2f1386df813a459a0c34fde676fc2"

SRC_URI = "https://launchpad.net/${BPN}/trunk/${PV}/+download/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "2a3d4ba1d11b52b4f6a7f39622ebf736"
SRC_URI[sha256sum] = "74d2ea90e103323c1f2d6a6cc9617cdae6877573eddb31aaf31a40f354cc2d2a"

inherit autotools-brokensep pkgconfig gettext pythonnative

DEPENDS = "zlib cracklib"

EXTRA_OECONF = " \
    --with-python-binary=${PYTHON} \
"

do_compile() {
    # make distustils part for python bindings happy
    export STAGING_INCDIR=${STAGING_INCDIR}
    export STAGING_LIBDIR=${STAGING_LIBDIR}
    export BUILD_SYS=${BUILD_SYS}
    export HOST_SYS=${HOST_SYS}
    base_do_compile
}

do_install() {
    # make distustils part for python bindings happy
    export STAGING_INCDIR=${STAGING_INCDIR}
    export STAGING_LIBDIR=${STAGING_LIBDIR}
    export BUILD_SYS=${BUILD_SYS}
    export HOST_SYS=${HOST_SYS}
    autotools_do_install
}

FILES_${PN} += " \
    ${libdir}/security/*.so \
"

PACKAGE_BEFORE_PN += "${PN}-python"

FILES_${PN}-python = " \
    ${PYTHON_SITEPACKAGES_DIR} \
"

FILES_${PN}-staticdev += " \
    ${PYTHON_SITEPACKAGES_DIR}/*.a \
    ${libdir}/security/*.a \
"
FILES_${PN}-dev += " \
    ${PYTHON_SITEPACKAGES_DIR}/*.la \
    ${libdir}/security/*.la \
"

FILES_${PN}-dbg += "\
    ${PYTHON_SITEPACKAGES_DIR}/.debug \
    ${libdir}/security/.debug \
"
