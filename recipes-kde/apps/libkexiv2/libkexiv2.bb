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
SRC_URI[md5sum] = "69109af3b5167282b22f393fc2ae5692"
SRC_URI[sha256sum] = "53b9a4ecda0f76df1a5b9f7b8184b85e847838cf97e4ad3036a6c5bb719993e5"
