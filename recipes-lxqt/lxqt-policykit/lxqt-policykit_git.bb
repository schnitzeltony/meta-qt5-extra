SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "28a5fc85693cd7cc6a10f787c46473efa0c976d4"
PV = "0.9.0+git${SRCPV}"
