SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "930313ace6621069059ebee94aa6b619"
SRC_URI[sha256sum] = "ffc1b79a96b909dca07f418fc443cfdd1deeebe1ec3cdf0e7cede9a4e6765c89"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
