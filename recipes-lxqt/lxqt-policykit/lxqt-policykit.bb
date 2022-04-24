SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "e00002ffec23499ad2919bbd59af357a8d1f84a1"
PV = "1.1.0"
