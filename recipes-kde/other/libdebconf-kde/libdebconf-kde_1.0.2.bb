SUMMARY = "A library that talks debconf protocol"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-base

DEPENDS += " \
    kcoreaddons \
    ki18n \
    kiconthemes \
    ktextwidgets \
    kwidgetsaddons \
"

SRC_URI[md5sum] = "3680540e33a6cd1f5633fad2fdd93e56"
SRC_URI[sha256sum] = "cd70ab39784d93bdb5e3ec856798bcf8b74b29ed99f41276c0cece868b95bb84"
