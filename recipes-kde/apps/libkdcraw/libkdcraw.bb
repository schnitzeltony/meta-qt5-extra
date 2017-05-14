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
SRC_URI[md5sum] = "184bcc51e662f036d40ebf0e4798e816"
SRC_URI[sha256sum] = "fe66b9f02037db6ad3125e4e0759283f7ab0baa34eaae73473dfd39b3ff818a8"
