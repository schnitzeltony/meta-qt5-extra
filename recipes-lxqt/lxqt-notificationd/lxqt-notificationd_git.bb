SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "1fa37841e17e573f4e7f2d9636369509051b7a15"
PV = "0.11.0"
