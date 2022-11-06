SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "40039bb4e81221b8d6a0e759a4443cca39f4ea65"
PV = "1.2.0"
