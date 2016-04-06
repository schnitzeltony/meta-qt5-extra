SUMMARY = "Exif, Iptc and XMP metadata manipulation library and tools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=625f055f41728f84a8d7938acc35bdc2"

DEPENDS = "zlib expat"

SRC_URI = "http://www.exiv2.org/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "258d4831b30f75a01e0234065c6c2806"
SRC_URI[sha256sum] = "c80bfc778a15fdb06f71265db2c3d49d8493c382e516cb99b8c9f9cbde36efa4"

inherit cmake gettext

INSANE_SKIP_${PN} = "useless-rpaths"

do_install_append() {
    install -d ${D}${mandir}
    mv ${D}${prefix}/man ${D}${mandir}
}
