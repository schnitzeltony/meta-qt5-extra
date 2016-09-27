SUMMARY = "GUI tools to adjust settings of the operating system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt

DEPENDS += " \
    liblxqt \
"

SRCREV = "5d8678a974e5832fea9e1f6f871b21e05cc9fbc3"
PV = "0.11.0"

FILES_${PN} += "${datadir}/polkit-1"

RDEPENDS_${PN} += "lxqt-policykit"
