SUMMARY = "Translations of LXQt"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += "liblxqt"

SRCREV = "ed7ab455d3d8cd1a563bf5a8e19c6b6a683c1280"
PV = "0.11.0"

ALLOW_EMPTY_${PN} = "1"
