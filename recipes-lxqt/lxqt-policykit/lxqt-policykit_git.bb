SUMMARY = "The LXQt PolicyKit agent"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

DEPENDS += "polkit-qt-1 liblxqt libqtxdg"

SRCREV = "dee8dfa656f699f99868374e5f1673c3ef9c918c"
PV = "0.12.0"

RPROVIDES_${PN} += "lxqt-common"
RREPLACES_${PN} += "lxqt-common"
RCONFLICTS_${PN} += "lxqt-common"
