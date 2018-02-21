SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "d4e44d13f54c007b444eb68944cc7bb6"
SRC_URI[sha256sum] = "279ec9b4e6b7372ed0d70dadc7a0f9dcf1045bfadf11fb0edbc1907c1988d8f4"

FILES_${PN} += "${datadir}/wallpapers"
