SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "1c6dcff4dd988d57e8666d29436cd770"
SRC_URI[sha256sum] = "052f6d978b1230706821f67574a7d053fadfb25de65227ffc8389a8570ac6003"

FILES_${PN} += "${datadir}/wallpapers"
