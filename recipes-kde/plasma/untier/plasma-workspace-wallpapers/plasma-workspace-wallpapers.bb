SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7c15c847fa5419705e2e211531bfd8a2"
SRC_URI[sha256sum] = "c1366566cbfff626964b05e5c8655aa456a4ada0f1614717dfb6d0f09da38e97"

FILES_${PN} += "${datadir}/wallpapers"
