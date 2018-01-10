SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "33ec0b55281f967e650069de8b52923a"
SRC_URI[sha256sum] = "f50e0a4013ef62b1a4ec64e7bc5cfbf29dfccc0497f54944ae165e72d6ba0c7e"

FILES_${PN} += "${datadir}/wallpapers"
