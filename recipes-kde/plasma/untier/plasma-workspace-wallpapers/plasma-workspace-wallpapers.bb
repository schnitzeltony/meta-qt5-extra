SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "2f49bf3d1fd85b34bfd25e43e83c932b"
SRC_URI[sha256sum] = "fd9f22cbbb300fb81d11f188cb431acc90a3d9720540abbea6df292b7accf0f3"

FILES_${PN} += "${datadir}/wallpapers"
