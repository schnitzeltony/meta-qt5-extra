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
SRC_URI[md5sum] = "4b846e344fdaadc7ab52f38d19b2f083"
SRC_URI[sha256sum] = "bee9a16eda002146b42f358b0dc58c5db832719870761264cc6cf0a199ab0537"
