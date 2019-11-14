SUMMARY = "Plasma wallpapers"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
"

inherit kde-plasma

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b7e1a3b3bcc10156eadb66114827f2cb"
SRC_URI[sha256sum] = "44d0f93a09db2703d526903b6da1330c6290645022bf72352bde08f61a1339ed"

FILES_${PN} += "${datadir}/wallpapers"
