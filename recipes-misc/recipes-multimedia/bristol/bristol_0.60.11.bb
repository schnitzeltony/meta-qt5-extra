SUMMARY = "Emulator for vintage synthesisers, electric pianos and organs"
HOMEPAGE = "https://sourceforge.net/projects/bristol/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=d32239bcb673463ab874e80d47fae504"

inherit autotools pkgconfig  distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    virtual/libx11 \
    alsa-lib \
    jack \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/0.60/${BPN}-${PV}.tar.gz \
    file://0001-Do-not-force-sse.patch \
    file://0002-Do-not-include-alsa-iatomic.h.patch \
    file://0003-bristoljackstats-do-not-overwrite-LDFLAGS.patch \
    file://0004-Avoid-crosscompile-warnings.patch \
"
SRC_URI[md5sum] = "9ea4dacdac0dba3048156e2f6a5ee4d6"
SRC_URI[sha256sum] = "7d1f0bbd0d7d303fc77c6b9549b61708d7a83b4dc007818011b1f55d1fa922ba"

EXTRA_OECONF = " \
    --disable-version-check \
    --disable-oss \
    --enable-jack-default-audio \
"

do_install_append() {
    # the tar magic makes files owned by build user
    chown -R root:root ${D}${datadir}
    # align data paths
    mv ${D}${datadir}/bristol/bristol-${PV}/* ${D}${datadir}/bristol/
    rmdir ${D}${datadir}/bristol/bristol-${PV}
}
