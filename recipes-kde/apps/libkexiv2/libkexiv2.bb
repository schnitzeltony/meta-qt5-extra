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
SRC_URI[md5sum] = "1d1dd42a07f377aab1c2443f716160fc"
SRC_URI[sha256sum] = "c94af99abc9fd47300576bf5677ff3b51cf174dfb9a2cba6963188c71ce568c9"
