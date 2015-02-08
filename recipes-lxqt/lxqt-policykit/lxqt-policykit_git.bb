SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "2b0e784cf3a71bcee25cafc844ec34306eb17aaf"
PV = "0.9.0"

FILES_${PN} += " \
"
