SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "58bc64a73f56ec47c9edf17b43b4b784a7431ddd"
PV = "0.17.0"
