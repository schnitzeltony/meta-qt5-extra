SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "424993551ed03c409c08e5067505a7df5f5adb81f6febf303fd763e6226a7394"

FILES:${PN} += "${datadir}/wallpapers"
