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
SRC_URI[md5sum] = "2d33323dad9db0484a4ca9c7f43e2910"
SRC_URI[sha256sum] = "4d4171c3da949c7a0c6109f32f156237ccaff52cdb8bef2da9a96e2a1a2fb031"
