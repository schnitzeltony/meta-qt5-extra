SUMMARY = "MDA-LV2 is an LV2 port of the MDA plugins by Paul Kellett"
HOMEPAGE = "https://drobilla.net/software/mda-lv2"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit waf distro_features_check pkgconfig

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "lv2"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "1962f48c54eafe52a3d2471cd3072aa8"
SRC_URI[sha256sum] = "a476c31ed9f8b009ebacc32a02d06ba9584c0d0d03f03dd62b1354d10a030442"

EXTRA_OECONF = " \
    --lv2dir=${libdir}/lv2 \
"

FILES_${PN} += "${libdir}/lv2"

