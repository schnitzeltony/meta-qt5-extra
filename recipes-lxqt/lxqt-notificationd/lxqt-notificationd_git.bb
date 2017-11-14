SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "6a93910037d2d59bd885fa71e2ea713778376869"
PV = "0.12.0"
