SUMMARY = "Daemon used to register global keyboard shortcuts"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt"

SRCREV = "84e9c3148e70bbb5338cb2edcf09d6ff6d74e082"
PV = "0.12.0"

RPROVIDES_${PN} += "lxqt-common"
RREPLACES_${PN} += "lxqt-common"
RCONFLICTS_${PN} += "lxqt-common"
