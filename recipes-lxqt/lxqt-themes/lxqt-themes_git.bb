SUMMARY = "Themes, graphics and icons for LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig

SRCREV = "9d86cc594b7f181036b7e3ba128fd467b2e2e8fd"
PV = "0.12.0"

RPROVIDES_${PN} += "lxqt-common"
RREPLACES_${PN} += "lxqt-common"
RCONFLICTS_${PN} += "lxqt-common"
