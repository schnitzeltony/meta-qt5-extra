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
SRC_URI[md5sum] = "889398766336bcd55e71d0ca5aad5aeb"
SRC_URI[sha256sum] = "30df02047c0f1b97a7c90c8eb5f7a3c5d322f13e0158395d3f9798ff21ed529e"
