SUMMARY = "The LXQt notification daemon"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt libqtxdg kwindowsystem"

SRCREV = "edf887014a1312aec61a345c298da447c4970d33"
PV = "0.9.0"
