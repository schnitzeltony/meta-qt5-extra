SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "6fb25e9bef0f18a08c9b6b51ae2970be8caa7bc8"
PV = "1.2.0"
