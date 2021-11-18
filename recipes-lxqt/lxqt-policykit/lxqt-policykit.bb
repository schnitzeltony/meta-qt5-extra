SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "a0c4a233dda05a505277f7d377564c4892dd2181"
PV = "1.0.0"
