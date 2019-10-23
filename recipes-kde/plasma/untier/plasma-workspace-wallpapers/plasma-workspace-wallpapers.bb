SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "56e5035e7fc73a525e95cc8ecc4e84b6"
SRC_URI[sha256sum] = "a44582a816998b41de4800b52cd461ce09ef2c7ca5a9b65b02d489e78a241eab"

FILES_${PN} += "${datadir}/wallpapers"
