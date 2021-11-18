SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "0fb3d53ae9812546db6cd1ea2c2911956bc1c9b6"
PV = "1.0.0"
