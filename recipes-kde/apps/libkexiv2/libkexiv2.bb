SUMMARY = "Libkexiv2 is a wrapper around Exiv2 library"
LICENSE = "GPLv2 & BSD & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
    file://COPYING.LIB;md5=3214f080875748938ba060314b4f727d \
"

inherit kde-apps

DEPENDS += "\
    exiv2 \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "0d317b029b04ff80c6871c5d91715779"
SRC_URI[sha256sum] = "81ea2e2c818bb9d7d52025aecf1a2a348e68f822b78285cd887dd46e44a640f2"
