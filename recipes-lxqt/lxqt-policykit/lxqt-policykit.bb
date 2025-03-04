SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "f9902dbcecc0ceffc98c4fc77c2d4a11d90855b0"
PV = "1.4.0"
