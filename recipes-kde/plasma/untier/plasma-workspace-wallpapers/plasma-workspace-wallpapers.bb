SUMMARY = "Plasma wallpapers"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "8085b42ee2f18b6459ef88ced94430a4e82087509b2ec341af63f82edff7154f"

FILES:${PN} += "${datadir}/wallpapers"
