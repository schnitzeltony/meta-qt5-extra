SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7006c1d844dd8d23fa6c4e18af645860"
SRC_URI[sha256sum] = "043b459e801d33caad8743f1133eb27edebb42171b08393bda92ea69ccd6fa75"

FILES_${PN} += "${datadir}/wallpapers"
