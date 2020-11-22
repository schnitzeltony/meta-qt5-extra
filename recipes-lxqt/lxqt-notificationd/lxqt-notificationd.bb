SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "15e3f2f34c5a169f3ea8b634e97ef3ed63e342a0"
PV = "0.16.0"
