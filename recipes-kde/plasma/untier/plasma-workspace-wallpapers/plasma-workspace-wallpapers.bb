SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6794494bbbe38107995e274112ec22aa"
SRC_URI[sha256sum] = "fdb513ecd4ad42c92f8757b86fd672cecee07a93f91e6b49497598c370dcdb96"

FILES_${PN} += "${datadir}/wallpapers"
