SUMMARY = "Translations of LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt"

SRCREV = "338b1ff6308ca271902f72715f61a40c2f93de93"
PV = "0.12.0"

ALLOW_EMPTY_${PN} = "1"
