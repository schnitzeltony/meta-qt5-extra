SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "737f4c4d5723a96b735b3b4cf0fc33e578fc8ce6"
PV = "0.14.0"
