SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "119336efe28ccac9aacc54633ea2972cfbfaf6ba"
PV = "0.9.0+git${SRCPV}"
