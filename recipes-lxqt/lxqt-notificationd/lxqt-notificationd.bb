SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "01699d85bb48411e80877610f6d11b457f57cc17"
PV = "1.4.0"
