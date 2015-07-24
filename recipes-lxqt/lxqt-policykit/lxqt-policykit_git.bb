SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "afc4614bc5024cc1d2d3aa3beab7d9e9ef183781"
PV = "0.9.0+git${SRCPV}"
