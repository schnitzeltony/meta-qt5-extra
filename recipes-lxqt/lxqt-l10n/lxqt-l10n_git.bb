SUMMARY = "Translations of LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt"

SRCREV = "aacbd7232409ce23f55640dbbdb1c3d38c0633a1"
PV = "0.11.2"

ALLOW_EMPTY_${PN} = "1"
