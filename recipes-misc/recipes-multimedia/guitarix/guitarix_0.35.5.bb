SUMMARY = "A virtual guitar amplifier"
HOMEPAGE = "http://guitarix.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=384f45fb7968a0fe30622ce6160d3b69"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${BPN}2-${PV}.tar.xz \
    file://0001-do-not-perform-link-test-durin-cross-build.patch \
"
SRC_URI[md5sum] = "945ce769b2338c0fc7422f485282e91e"
SRC_URI[sha256sum] = "0456adb0197562e00fa4fa7961c6acaeb9acd1b23a1e8a1536cac9a1b059ee02"

inherit waf fontcache gettext

DEPENDS += " \
    gperf-native \
    intltool-native \
    boost \
    libeigen \
    avahi \
    bluez5 \
    gtkmm \
    jack \
    lilv \
    ladspa-sdk \
    libsndfile1 \
    lrdf \
    zita-resampler \
    zita-convolver \
"

EXTRA_OECONF = " \
    --disable-sse \
    --ldflags="${LDFLAGS}" \
    --no-ldconfig \
    --no-desktop-update \
    --shared-lib \
    --lib-dev \
    --install-roboto-font \
"

do_install_append() {
    # some corrections [dev-elf] - inspired by https://src.fedoraproject.org/rpms/guitarix/blob/master/f/guitarix.spec
    chmod 755 ${D}${libdir}/libgxw*.so.0.1
    rm -rf ${D}${libdir}/libgxw*.so
    ln -sf libgxwmm.so.0.1 ${D}${libdir}/libgxwmm.so
    ln -sf libgxw.so.0.1 ${D}${libdir}/libgxw.so
}

FILES_${PN} += " \
    ${datadir}/fonts \
    ${datadir}/gx_head \
    ${datadir}/ladspa \
    ${libdir}/ladspa \
    ${libdir}/lv2 \
"
