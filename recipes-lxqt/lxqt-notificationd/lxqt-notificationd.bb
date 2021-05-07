SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "6b46373d6e1ec8ea8d57ded0839c67ab2a074b98"
PV = "0.17.0"
