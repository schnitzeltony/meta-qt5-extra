SUMMARY = "Breeze icon theme"
LICENSE = "LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING-ICONS;md5=3e7f6a3da5801872be1084a978cfc0eb \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gtk-icon-cache

SRC_URI[md5sum] = "2d293916db5ea309e2f4b3659c394a79"
SRC_URI[sha256sum] = "012cfadd18c1acf6e5a7a0fa9163015072e7b14ac2716da220961085709bf1a8"

PV = "${KF5_VERSION}"

FILES_${PN} += "${datadir}/icons"
