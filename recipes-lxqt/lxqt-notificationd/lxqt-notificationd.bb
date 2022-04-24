SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "eeb0d87c64577ab0472bd2fa9c0d8baa8ce76866"
PV = "1.1.0"
