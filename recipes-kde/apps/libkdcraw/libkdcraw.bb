SUMMARY = "Libkdcraw is a C++ interface around LibRaw library"
LICENSE = "GPLv2 & BSD & LGPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1 \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-apps

DEPENDS += "\
    libraw \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "ba30a05dc0c026ec0b82039f6c61107d"
SRC_URI[sha256sum] = "21cf13ec2184702c8196e2e21dda831809d636932968f503f60bde48ee248c29"
