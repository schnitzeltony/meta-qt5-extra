SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "f61f15a373ec6ec86d503d42f4e22cf3"
SRC_URI[sha256sum] = "b167834a2e716f0f47966d749e306cad661e8c59f56b6ae463f13d6303bd7372"

FILES_${PN} += "${datadir}/wallpapers"
