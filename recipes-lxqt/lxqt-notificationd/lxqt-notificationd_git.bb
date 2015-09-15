SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "c3750aac12171d3e35c045083b75b2f9a1a96366"
PV = "0.9.0+git${SRCPV}"
